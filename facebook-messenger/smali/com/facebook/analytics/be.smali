.class Lcom/facebook/analytics/be;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/c/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/facebook/analytics/be;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 175
    invoke-direct {p0, p1}, Lcom/facebook/analytics/be;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/c/e;
    .locals 2

    .prologue
    .line 179
    new-instance v1, Lcom/facebook/analytics/c/e;

    const-class v0, Lcom/facebook/analytics/c/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/be;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/c/a;

    invoke-direct {v1, v0}, Lcom/facebook/analytics/c/e;-><init>(Lcom/facebook/analytics/c/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 175
    invoke-virtual {p0}, Lcom/facebook/analytics/be;->a()Lcom/facebook/analytics/c/e;

    move-result-object v0

    return-object v0
.end method
