// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.List;

// Referenced classes of package com.weather.dal2.data:
//            Record

public interface DaypartIntlForecastRecord
    extends Record
{
    public static interface DaypartIntlForecastDoc
    {

        public abstract List getDiData();

        public abstract DaypartIntlForecastHeader getDiHeader();
    }

    public static interface DaypartIntlForecastDoc.DaypartIntlForecastData
    {

        public abstract String getDayPartName();

        public abstract Long getForecastDateInGMT();

        public abstract String getForecastDateLocal();

        public abstract String getForecastText();

        public abstract String getShortCast();

        public abstract Integer getUvIndex();

        public abstract Integer getWeatherIconCode();

        public abstract Integer getWeatherIconCodeExtended();
    }

    public static interface DaypartIntlForecastDoc.DaypartIntlForecastHeader
    {

        public abstract Long getProcessTime();

        public abstract String getStationId();

        public abstract String getStationName();
    }


    public abstract DaypartIntlForecastDoc getDiDoc();
}
