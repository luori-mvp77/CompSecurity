.class public Lcom/facebook/orca/chatheads/dz;
.super Ljava/lang/Object;
.source "IsDeviceForegroundEnabledProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-string v0, "messenger_android_device_push_persistence"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/dz;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .param p2    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/orca/chatheads/annotations/IsChatHeadsEnabled;
        .end annotation
    .end param
    .param p3    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/orca/chatheads/annotations/IsHeadCaseEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dz;->b:Lcom/facebook/prefs/shared/d;

    .line 33
    iput-object p2, p0, Lcom/facebook/orca/chatheads/dz;->c:Ljavax/inject/a;

    .line 34
    iput-object p3, p0, Lcom/facebook/orca/chatheads/dz;->d:Ljavax/inject/a;

    .line 35
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 39
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dz;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/chatheads/dz;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/chatheads/dz;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/dz;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dz;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
