.class Lcom/aetn/history/android/historyhere/view/MoreActivity$2;
.super Ljava/lang/Object;
.source "MoreActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/view/MoreActivity;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/view/MoreActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/view/MoreActivity;

    .prologue
    .line 100
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 103
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$000(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/aetn/history/android/historyhere/view/AboutActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 104
    .local v0, "i":Landroid/content/Intent;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$000(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 105
    return-void
.end method
