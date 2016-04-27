package com.example.thesamespace.statisticalservice.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.thesamespace.statisticalservice.calendar.EventDecorator;
import com.example.thesamespace.statisticalservice.R;
import com.example.thesamespace.statisticalservice.adapter.Member;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class FragmentCalendar extends Fragment implements OnDateSelectedListener {
    private Member member;
    private MaterialCalendarView materialCalendarView;
    private TextView tv_selectedDay;

    public FragmentCalendar() {

    }

    @SuppressLint("ValidFragment")
    public FragmentCalendar(Member member) {
        this.member = member;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        materialCalendarView = (MaterialCalendarView) view.findViewById(R.id.calendar_workTime);
        materialCalendarView.setOnDateChangedListener(this);
        tv_selectedDay = (TextView) view.findViewById(R.id.tv_selectedDay);
    }

    @Override
    public void onStart() {
        super.onStart();
        new ApiSimulator().executeOnExecutor(Executors.newSingleThreadExecutor());
    }

    @Override
    public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
        tv_selectedDay.setText(date.getYear() + "年" + (date.getMonth() + 1) + "月" + date.getDay() + "日");
    }

    private class ApiSimulator extends AsyncTask<Void, Void, List<CalendarDay>> {

        @Override
        protected List<CalendarDay> doInBackground(@NonNull Void... voids) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, 0);
            ArrayList<CalendarDay> dates = new ArrayList<>();
            for (int i = 0; i < 30; i++) {
                CalendarDay day = CalendarDay.from(calendar);
                dates.add(day);
                calendar.add(Calendar.DATE, 5);
            }
            return dates;
        }

        @Override
        protected void onPostExecute(@NonNull List<CalendarDay> calendarDays) {
            super.onPostExecute(calendarDays);
            materialCalendarView.addDecorator(new EventDecorator(Color.RED, calendarDays, "休"));
        }
    }
}
