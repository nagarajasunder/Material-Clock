package com.geekydroid.materialclock.application.constants

import com.geekydroid.materialclock.R
import com.geekydroid.materialclock.ui.alarm.model.AlarmSound

object Constants {



    /**
     * This constant is to handle the default week day string if none of the week days is selected
     */
    const val WEEK_DAYS_UNSELECTED_DEFAULT_STR = "smtwtfs"
    const val EVERYDAY = "Everyday"
    const val NO_OF_DAYS_IN_A_WEEK = 7

    const val KEY_ALARM_ID = "ALARM_ID"
    const val KEY_SNOOZED_ALARM_ID = "SNOOZED_ALARM_ID"
    const val KEY_ALARM_SCHEDULE_DATE_MILLIS = "ALARM_SCHEDULE_DATE_MILLIS"
    const val KEY_ALARM_SCHEDULE_TIME_MILLIS = "ALARM_SCHEDULE_TIME_MILLIS"
    const val KEY_ALARM_TRIGGER_MILLIS = "ALARM_TRIGGER_MILLIS"
    const val KEY_ALARM_LABEL = "ALARM_LABEL"
    const val KEY_ALARM_SCHEDULE_TYPE = "ALARM_SCHEDULE_TYPE"
    const val KEY_ALARM_TYPE = "ALARM_TYPE"
    const val KEY_ALARM_SCHEDULE_DAYS = "ALARM_SCHEDULE_DAYS"
    const val KEY_IS_ALARM_VIBRATE = "ALARM_VIBRATE"
    const val KEY_ALARM_ACTION_TYPE = "ALARM_ACTION_TYPE"
    const val ALARM_NOTIFICATION_CHANNEL_ID = "ALARM_NOTIFICATION_CHANNEL"
    const val ALARM_NOTIFICATION_REMINDER_CHANNEL_ID = "ALARM_NOTIFICATION_REMINDER_CHANNEL"
    const val ALARM_REMINDER_HOUR = 2
    const val ALARM_SNOOZE_INTERVAL_MILLIS = 5*60*1000L
    const val ALARM_DISMISS_PENDING_INTENT_ID = 98
    const val ALARM_ACTION_SNOOZE_PENDING_INTENT_ID = 47
    const val ALARM_ACTION_STOP_PENDING_INTENT_ID = 39
    const val SNOOZE_ALARM_ID = 117
    const val REMINDER_ALARM_ID = 71
    const val ARG_ALARM_ID = "ALARM_ID"
    const val ARG_HIDE_BOTTOM_BAR = "HIDE_BOTTOM_BAR"
    val alarmSoundsList = listOf(
        AlarmSound(0, R.raw.alarmsound1,"Default"),
        AlarmSound(1, R.raw.alarmsound2,"Rise"),
    )
    const val TIMER_DEFAULT_HOUR = 0
    const val TIMER_DEFAULT_MINUTE = 0
    const val TIMER_DEFAULT_SECOND = 0
    const val TIMER_EVENT_BUNDLE = "TIMER_EVENT_BUNDLE"
    const val TIMER_NOTIFICATION_CHANNEL_ID = "TIMER_NOTIFICATION_CHANNEL"
    const val TIMER_TIME_UP_NOTIFICATION_CHANNEL_ID = "TIMER_TIME_UP_NOTIFICATION_CHANNEL"
    const val TIMER_NOTIFICATION_ID = 57
    const val TIMER_PAUSE_PENDING_INTENT_ID = 58
    const val TIMER_ADD_TIME_PENDING_INTENT_ID = 59
    const val TIMER_RESUME_PENDING_INTENT_ID = 60
    const val TIMER_RESET_PENDING_INTENT_ID = 61
    const val TIMER_TIME_UP_PENDING_INTENT_ID = 62
    const val TIMER_ACTION_TYPE = "TIMER_ACTION_TYPE"
    const val TIMER_ACTION_START_TIMER = "TIMER_ACTION_START_TIMER"
    const val TIMER_ACTION_RESET_TIMER = "TIMER_ACTION_RESET_TIMER"
    const val TIMER_ACTION_PAUSE_TIMER = "TIMER_ACTION_PAUSE_TIMER"
    const val TIMER_ACTION_RESUME_TIMER = "TIMER_ACTION_RESUME_TIMER"
    const val TIMER_ACTION_ADD_MIN = "TIMER_ACTION_ADD_MIN"

    const val TIMER_NOTIFICATION_DEEP_LINK_URL = "https://materialclock.com/timer"
}