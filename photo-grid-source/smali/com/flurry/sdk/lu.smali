.class public Lcom/flurry/sdk/lu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/kf;
.implements Lcom/flurry/sdk/lh$a;
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/flurry/sdk/lu;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lu;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 38
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v1

    .line 40
    const-string v0, "CaptureUncaughtExceptions"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/lu;->b:Z

    .line 41
    const-string v0, "CaptureUncaughtExceptions"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 42
    const/4 v0, 0x4

    sget-object v1, Lcom/flurry/sdk/lu;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, CrashReportingEnabled = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/flurry/sdk/lu;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 45
    invoke-static {}, Lcom/flurry/sdk/lv;->a()Lcom/flurry/sdk/lv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/flurry/sdk/lv;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 46
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 60
    const-string v0, "CaptureUncaughtExceptions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/lu;->b:Z

    .line 62
    const/4 v0, 0x4

    sget-object v1, Lcom/flurry/sdk/lu;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onSettingUpdate, CrashReportingEnabled = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/flurry/sdk/lu;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 67
    :goto_0
    return-void

    .line 65
    :cond_0
    const/4 v0, 0x6

    sget-object v1, Lcom/flurry/sdk/lu;->a:Ljava/lang/String;

    const-string v2, "onSettingUpdate internal error!"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 50
    invoke-static {}, Lcom/flurry/sdk/lv;->b()V

    .line 53
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    .line 55
    const-string v1, "CaptureUncaughtExceptions"

    invoke-virtual {v0, v1, p0}, Lcom/flurry/sdk/lh;->b(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)Z

    .line 56
    return-void
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 71
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 73
    iget-boolean v0, p0, Lcom/flurry/sdk/lu;->b:Z

    if-eqz v0, :cond_2

    .line 74
    const-string v0, ""

    .line 75
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    .line 76
    if-eqz v1, :cond_3

    array-length v1, v1

    if-lez v1, :cond_3

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 79
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 89
    :cond_1
    :goto_0
    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v1

    const-string v2, "uncaught"

    invoke-virtual {v1, v2, v0, p2}, Lcom/flurry/sdk/hi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    :cond_2
    invoke-static {}, Lcom/flurry/sdk/ld;->a()Lcom/flurry/sdk/ld;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ld;->g()V

    .line 93
    invoke-static {}, Lcom/flurry/sdk/jg;->a()Lcom/flurry/sdk/jg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jg;->d()V

    .line 94
    return-void

    .line 85
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 86
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
