// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            TwitterMethod

class ncTask extends ncTask
{

    final AsyncTwitterImpl this$0;
    final String val$categorySlug;

    public void invoke(List list)
        throws TwitterException
    {
        ResponseList responselist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getMemberSuggestions(val$categorySlug);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotMemberSuggestions(responselist);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(List list, String s)
    {
        this$0 = final_asynctwitterimpl;
        val$categorySlug = s;
        super(final_asynctwitterimpl, TwitterMethod.this, list);
    }
}
