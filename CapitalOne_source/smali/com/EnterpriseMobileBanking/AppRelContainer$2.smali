.class Lcom/EnterpriseMobileBanking/AppRelContainer$2;
.super Ljava/lang/Object;
.source "AppRelContainer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppRelContainer;->onAnimationEnd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/AppRelContainer;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/AppRelContainer;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppRelContainer$2;->this$0:Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 101
    const v0, 0x7f0800b0

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->findAppViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 102
    return-void
.end method
