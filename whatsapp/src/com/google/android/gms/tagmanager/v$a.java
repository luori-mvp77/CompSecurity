// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer, bh, v, ak

class sorFactory extends SQLiteOpenHelper
{

    final v arg;

    private void a(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        boolean flag;
        flag = DataLayer.a;
        sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
        obj = new HashSet();
        String as[] = sqlitedatabase.getColumnNames();
        int i = 0;
_L2:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Set) (obj)).add(as[i]);
        i++;
        if (!flag) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        boolean flag1;
        try
        {
            flag1 = ((Set) (obj)).remove("key");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            try
            {
                throw sqlitedatabase;
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase) { }
            try
            {
                throw sqlitedatabase;
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase) { }
            try
            {
                throw sqlitedatabase;
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        flag1 = ((Set) (obj)).remove("value");
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        flag1 = ((Set) (obj)).remove("ID");
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (((Set) (obj)).remove("expires"))
        {
            break MISSING_BLOCK_LABEL_153;
        }
        throw new SQLiteException("Database column missing");
        obj;
        sqlitedatabase.close();
        throw obj;
        try
        {
            if (!((Set) (obj)).isEmpty())
            {
                throw new SQLiteException("Database has extra columns");
            }
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
        return;
    }

    private boolean a(String s, SQLiteDatabase sqlitedatabase)
    {
        Object obj = null;
        sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
            "name"
        }, "name=?", new String[] {
            s
        }, null, null, null);
        boolean flag = sqlitedatabase.moveToFirst();
        if (sqlitedatabase != null)
        {
            try
            {
                sqlitedatabase.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        return flag;
        sqlitedatabase;
        sqlitedatabase = null;
_L4:
        bh.W((new StringBuilder()).append("Error querying for table ").append(s).toString());
        if (sqlitedatabase != null)
        {
            try
            {
                sqlitedatabase.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        return false;
        s;
        sqlitedatabase = obj;
_L2:
        if (sqlitedatabase != null)
        {
            try
            {
                sqlitedatabase.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
        SQLiteException sqliteexception;
        sqliteexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public SQLiteDatabase getWritableDatabase()
    {
        SQLiteDatabase sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
_L2:
        SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
        if (sqlitedatabase == null)
        {
            sqlitedatabase2 = super.getWritableDatabase();
        }
        return sqlitedatabase2;
        SQLiteException sqliteexception;
        sqliteexception;
        v.b(arg).getDatabasePath("google_tagmanager.db").delete();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        ak.ag(sqlitedatabase.getPath());
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        if (android.os.d.VERSION.SDK_INT >= 15)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
        cursor.moveToFirst();
        cursor.close();
        boolean flag;
        try
        {
            flag = a("datalayer", sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            try
            {
                throw sqlitedatabase;
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        sqlitedatabase.execSQL(v.pD());
        if (!DataLayer.a)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        a(sqlitedatabase);
        return;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    sorFactory(v v1, Context context, String s)
    {
        arg = v1;
        super(context, s, null, 1);
    }
}
