.class public abstract Landroid/support/v4/app/NotificationCompat$Style;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field mBigContentTitle:Ljava/lang/CharSequence;

.field mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;

.field mSummaryText:Ljava/lang/CharSequence;

.field mSummaryTextSet:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 1585
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1589
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mSummaryTextSet:Z

    return-void
.end method


# virtual methods
.method public build()Landroid/app/Notification;
    .locals 2

    .prologue
    .line 1601
    const/4 v0, 0x0

    .line 1602
    iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;

    if-eqz v1, :cond_0

    .line 1603
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 1605
    :cond_0
    return-object v0
.end method

.method public setBuilder(Landroid/support/v4/app/NotificationCompat$Builder;)V
    .locals 1

    .prologue
    .line 1592
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;

    if-eq v0, p1, :cond_0

    .line 1593
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;

    .line 1594
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;

    if-eqz v0, :cond_0

    .line 1595
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v0, p0}, Landroid/support/v4/app/NotificationCompat$Builder;->setStyle(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 1598
    :cond_0
    return-void
.end method
