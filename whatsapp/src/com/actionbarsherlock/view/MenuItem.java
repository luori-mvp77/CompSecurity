// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package com.actionbarsherlock.view:
//            ActionProvider, SubMenu

public interface MenuItem
{

    public abstract boolean collapseActionView();

    public abstract boolean expandActionView();

    public abstract ActionProvider getActionProvider();

    public abstract View getActionView();

    public abstract int getGroupId();

    public abstract Drawable getIcon();

    public abstract int getItemId();

    public abstract SubMenu getSubMenu();

    public abstract boolean hasSubMenu();

    public abstract boolean isActionViewExpanded();

    public abstract boolean isVisible();

    public abstract MenuItem setActionProvider(ActionProvider actionprovider);

    public abstract MenuItem setActionView(int i);

    public abstract MenuItem setActionView(View view);

    public abstract MenuItem setAlphabeticShortcut(char c);

    public abstract MenuItem setCheckable(boolean flag);

    public abstract MenuItem setChecked(boolean flag);

    public abstract MenuItem setEnabled(boolean flag);

    public abstract MenuItem setIcon(int i);

    public abstract MenuItem setIcon(Drawable drawable);

    public abstract MenuItem setNumericShortcut(char c);

    public abstract MenuItem setOnActionExpandListener(OnActionExpandListener onactionexpandlistener);

    public abstract MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener);

    public abstract void setShowAsAction(int i);

    public abstract MenuItem setTitle(int i);

    public abstract MenuItem setTitle(CharSequence charsequence);

    public abstract MenuItem setTitleCondensed(CharSequence charsequence);

    public abstract MenuItem setVisible(boolean flag);
}
