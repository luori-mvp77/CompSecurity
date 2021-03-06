.class public Lcom/google/android/gms/internal/it;
.super Lcom/google/android/gms/internal/il;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/it$1;,
        Lcom/google/android/gms/internal/it$a;
    }
.end annotation


# static fields
.field private static final HR:J

.field private static final HS:J

.field private static final HT:J

.field private static final HU:J

.field private static final NAMESPACE:Ljava/lang/String;


# instance fields
.field private HV:J

.field private HW:Lcom/google/android/gms/cast/MediaStatus;

.field private final HX:Lcom/google/android/gms/internal/iw;

.field private final HY:Lcom/google/android/gms/internal/iw;

.field private final HZ:Lcom/google/android/gms/internal/iw;

.field private final Ia:Lcom/google/android/gms/internal/iw;

.field private final Ib:Lcom/google/android/gms/internal/iw;

.field private final Ic:Lcom/google/android/gms/internal/iw;

.field private final Id:Lcom/google/android/gms/internal/iw;

.field private final Ie:Lcom/google/android/gms/internal/iw;

.field private final If:Lcom/google/android/gms/internal/iw;

.field private final Ig:Lcom/google/android/gms/internal/iw;

.field private final Ih:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/iw;",
            ">;"
        }
    .end annotation
.end field

.field private final Ii:Ljava/lang/Runnable;

.field private Ij:Z

.field private final mHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide/16 v2, 0x18

    const-string v0, "com.google.cast.media"

    invoke-static {v0}, Lcom/google/android/gms/internal/in;->aG(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/it;->NAMESPACE:Ljava/lang/String;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/it;->HR:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/it;->HS:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/it;->HT:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/it;->HU:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/it;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/it;->NAMESPACE:Ljava/lang/String;

    const-string v1, "MediaControlChannel"

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/internal/il;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/it$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/it$a;-><init>(Lcom/google/android/gms/internal/it;Lcom/google/android/gms/internal/it$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->Ii:Ljava/lang/Runnable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HS:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->HX:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->HX:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HR:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->HY:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->HY:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HR:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->HZ:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->HZ:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HR:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->Ia:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->Ia:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HT:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->Ib:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->Ib:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HR:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->Ic:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->Ic:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HR:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->Id:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->Id:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HR:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->Ie:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->Ie:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HR:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->If:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->If:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/iw;

    sget-wide v1, Lcom/google/android/gms/internal/it;->HR:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/iw;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->Ig:Lcom/google/android/gms/internal/iw;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->Ig:Lcom/google/android/gms/internal/iw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/it;->gp()V

    return-void
.end method

.method private J(Z)V
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/it;->Ij:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/it;->Ij:Z

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->Ii:Ljava/lang/Runnable;

    sget-wide v2, Lcom/google/android/gms/internal/it;->HU:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/it;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->Ii:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/it;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    return-object v0
.end method

.method private a(JLorg/json/JSONObject;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HX:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/iw;->p(J)Z

    move-result v3

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ib:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iw;->gr()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ib:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/iw;->p(J)Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v1

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/it;->Ic:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iw;->gr()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/it;->Ic:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v4, p1, p2}, Lcom/google/android/gms/internal/iw;->p(J)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    iget-object v4, p0, Lcom/google/android/gms/internal/it;->Id:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iw;->gr()Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v4, p0, Lcom/google/android/gms/internal/it;->Id:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v4, p1, p2}, Lcom/google/android/gms/internal/iw;->p(J)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_1
    :goto_1
    if-eqz v0, :cond_b

    const/4 v0, 0x2

    :goto_2
    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x1

    :cond_2
    if-nez v3, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    if-nez v1, :cond_9

    :cond_3
    new-instance v0, Lcom/google/android/gms/cast/MediaStatus;

    invoke-direct {v0, p3}, Lcom/google/android/gms/cast/MediaStatus;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/it;->HV:J

    const/4 v0, 0x7

    :goto_3
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/google/android/gms/internal/it;->HV:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->onStatusUpdated()V

    :cond_4
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/google/android/gms/internal/it;->HV:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->onStatusUpdated()V

    :cond_5
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->onMetadataUpdated()V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/iw;->d(JI)Z

    goto :goto_4

    :cond_7
    move v0, v2

    goto :goto_0

    :cond_8
    move v1, v2

    goto :goto_1

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v1, p3, v0}, Lcom/google/android/gms/cast/MediaStatus;->a(Lorg/json/JSONObject;I)I

    move-result v0

    goto :goto_3

    :cond_a
    return-void

    :cond_b
    move v0, v2

    goto :goto_2
.end method

.method static synthetic a(Lcom/google/android/gms/internal/it;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/it;->Ij:Z

    return p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/it;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/it;->J(Z)V

    return-void
.end method

.method private gp()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/it;->J(Z)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/it;->HV:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HX:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iw;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ib:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iw;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ic:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iw;->clear()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/iv;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/it;->Ie:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v3, v1, v2, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v3, "requestId"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v3, "type"

    const-string v4, "GET_STATUS"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    if-eqz v3, :cond_0

    const-string v3, "mediaSessionId"

    iget-object v4, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v4}, Lcom/google/android/gms/cast/MediaStatus;->fR()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v1

    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/iv;DLorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Volume cannot be "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/it;->Ic:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v3, v1, v2, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v3, "requestId"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v3, "type"

    const-string v4, "SET_VOLUME"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fR()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "level"

    invoke-virtual {v3, v4, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v4, "volume"

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p4, :cond_2

    const-string v3, "customData"

    invoke-virtual {v0, v3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v1

    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/iv;JILorg/json/JSONObject;)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    const/4 v6, 0x1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/it;->Ib:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v3, v1, v2, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    invoke-direct {p0, v6}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v3, "requestId"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v3, "type"

    const-string v4, "SEEK"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fR()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v3, "currentTime"

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/in;->o(J)D

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    if-ne p4, v6, :cond_2

    const-string v3, "resumeState"

    const-string v4, "PLAYBACK_START"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    :goto_0
    if-eqz p5, :cond_1

    const-string v3, "customData"

    invoke-virtual {v0, v3, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v1

    :cond_2
    const/4 v3, 0x2

    if-ne p4, v3, :cond_0

    :try_start_1
    const-string v3, "resumeState"

    const-string v4, "PLAYBACK_PAUSE"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/iv;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HX:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0, v2, v3, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v0, "requestId"

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "type"

    const-string v4, "LOAD"

    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "media"

    invoke-virtual {p2}, Lcom/google/android/gms/cast/MediaInfo;->toJson()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "autoplay"

    invoke-virtual {v1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "currentTime"

    invoke-static {p4, p5}, Lcom/google/android/gms/internal/in;->o(J)D

    move-result-wide v4

    invoke-virtual {v1, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    if-eqz p6, :cond_1

    array-length v0, p6

    if-lez v0, :cond_1

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    const/4 v0, 0x0

    :goto_0
    array-length v5, p6

    if-ge v0, v5, :cond_0

    aget-wide v5, p6, v0

    invoke-virtual {v4, v0, v5, v6}, Lorg/json/JSONArray;->put(IJ)Lorg/json/JSONArray;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "activeTrackIds"

    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    if-eqz p7, :cond_2

    const-string v0, "customData"

    invoke-virtual {v1, v0, p7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/iv;Lcom/google/android/gms/cast/TextTrackStyle;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/it;->Ig:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v3, v1, v2, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v3, "requestId"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v3, "type"

    const-string v4, "EDIT_TRACKS_INFO"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v3, "textTrackStyle"

    invoke-virtual {p2}, Lcom/google/android/gms/cast/TextTrackStyle;->toJson()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    const-string v3, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fR()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v1

    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/iv;Lorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/it;->HY:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v3, v1, v2, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v3, "requestId"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v3, "type"

    const-string v4, "PAUSE"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fR()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v3, "customData"

    invoke-virtual {v0, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v1

    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/iv;ZLorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/it;->Id:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v3, v1, v2, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v3, "requestId"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v3, "type"

    const-string v4, "SET_VOLUME"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fR()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "muted"

    invoke-virtual {v3, v4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v4, "volume"

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p3, :cond_0

    const-string v3, "customData"

    invoke-virtual {v0, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v1

    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/iv;[J)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->If:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0, v2, v3, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v0, "requestId"

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "type"

    const-string v4, "EDIT_TRACKS_INFO"

    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fR()J

    move-result-wide v4

    invoke-virtual {v1, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    const/4 v0, 0x0

    :goto_0
    array-length v5, p2

    if-ge v0, v5, :cond_0

    aget-wide v5, p2, v0

    invoke-virtual {v4, v0, v5, v6}, Lorg/json/JSONArray;->put(IJ)Lorg/json/JSONArray;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "activeTrackIds"

    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public final aD(Ljava/lang/String;)V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->He:Lcom/google/android/gms/internal/is;

    const-string v1, "message received: %s"

    new-array v2, v7, [Ljava/lang/Object;

    aput-object p1, v2, v6

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/is;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "type"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "requestId"

    const-wide/16 v3, -0x1

    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    const-string v4, "MEDIA_STATUS"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v1, "status"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v2, v3, v0}, Lcom/google/android/gms/internal/it;->a(JLorg/json/JSONObject;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->onStatusUpdated()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->onMetadataUpdated()V

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ie:Lcom/google/android/gms/internal/iw;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/internal/iw;->d(JI)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->He:Lcom/google/android/gms/internal/is;

    const-string v2, "Message is malformed (%s); ignoring: %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v6

    aput-object p1, v3, v7

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/is;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    :try_start_1
    const-string v4, "INVALID_PLAYER_STATE"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->He:Lcom/google/android/gms/internal/is;

    const-string v4, "received unexpected error: Invalid Player State."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/is;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/iw;

    const/16 v5, 0x834

    invoke-virtual {v0, v2, v3, v5, v1}, Lcom/google/android/gms/internal/iw;->b(JILorg/json/JSONObject;)Z

    goto :goto_1

    :cond_3
    const-string v4, "LOAD_FAILED"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->HX:Lcom/google/android/gms/internal/iw;

    const/16 v4, 0x834

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/iw;->b(JILorg/json/JSONObject;)Z

    goto :goto_0

    :cond_4
    const-string v4, "LOAD_CANCELLED"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->HX:Lcom/google/android/gms/internal/iw;

    const/16 v4, 0x835

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/iw;->b(JILorg/json/JSONObject;)Z

    goto :goto_0

    :cond_5
    const-string v4, "INVALID_REQUEST"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->He:Lcom/google/android/gms/internal/is;

    const-string v4, "received unexpected error: Invalid Request."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/is;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/iw;

    const/16 v5, 0x834

    invoke-virtual {v0, v2, v3, v5, v1}, Lcom/google/android/gms/internal/iw;->b(JILorg/json/JSONObject;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method

.method public b(Lcom/google/android/gms/internal/iv;Lorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/it;->Ia:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v3, v1, v2, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v3, "requestId"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v3, "type"

    const-string v4, "STOP"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fR()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v3, "customData"

    invoke-virtual {v0, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v1

    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method public b(JI)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->Ih:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/iw;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/iw;->d(JI)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/gms/internal/iv;Lorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fU()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/it;->HZ:Lcom/google/android/gms/internal/iw;

    invoke-virtual {v3, v1, v2, p1}, Lcom/google/android/gms/internal/iw;->a(JLcom/google/android/gms/internal/iv;)V

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/it;->J(Z)V

    :try_start_0
    const-string v3, "requestId"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v3, "type"

    const-string v4, "PLAY"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->fR()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v3, "customData"

    invoke-virtual {v0, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/gms/internal/it;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v1

    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method public fR()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No current media session"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->fR()J

    move-result-wide v0

    return-wide v0
.end method

.method public fV()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/it;->gp()V

    return-void
.end method

.method public getApproximateStreamPosition()J
    .locals 11

    const-wide/16 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v8

    if-nez v8, :cond_1

    :cond_0
    :goto_0
    return-wide v2

    :cond_1
    iget-wide v0, p0, Lcom/google/android/gms/internal/it;->HV:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getPlaybackRate()D

    move-result-wide v9

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getStreamPosition()J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getPlayerState()I

    move-result v0

    const-wide/16 v6, 0x0

    cmpl-double v1, v9, v6

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    :cond_2
    move-wide v2, v4

    goto :goto_0

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v6, p0, Lcom/google/android/gms/internal/it;->HV:J

    sub-long/2addr v0, v6

    cmp-long v6, v0, v2

    if-gez v6, :cond_7

    move-wide v6, v2

    :goto_1
    cmp-long v0, v6, v2

    if-nez v0, :cond_4

    move-wide v2, v4

    goto :goto_0

    :cond_4
    invoke-virtual {v8}, Lcom/google/android/gms/cast/MediaInfo;->getStreamDuration()J

    move-result-wide v0

    long-to-double v6, v6

    mul-double/2addr v6, v9

    double-to-long v6, v6

    add-long/2addr v4, v6

    cmp-long v6, v0, v2

    if-lez v6, :cond_5

    cmp-long v6, v4, v0

    if-lez v6, :cond_5

    :goto_2
    move-wide v2, v0

    goto :goto_0

    :cond_5
    cmp-long v0, v4, v2

    if-gez v0, :cond_6

    move-wide v0, v2

    goto :goto_2

    :cond_6
    move-wide v0, v4

    goto :goto_2

    :cond_7
    move-wide v6, v0

    goto :goto_1
.end method

.method public getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    goto :goto_0
.end method

.method public getMediaStatus()Lcom/google/android/gms/cast/MediaStatus;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->HW:Lcom/google/android/gms/cast/MediaStatus;

    return-object v0
.end method

.method public getStreamDuration()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaInfo;->getStreamDuration()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method protected onMetadataUpdated()V
    .locals 0

    return-void
.end method

.method protected onStatusUpdated()V
    .locals 0

    return-void
.end method
