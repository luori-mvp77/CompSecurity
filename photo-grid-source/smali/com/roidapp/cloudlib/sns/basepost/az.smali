.class final Lcom/roidapp/cloudlib/sns/basepost/az;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/aw;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/aw;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/az;->a:Lcom/roidapp/cloudlib/sns/basepost/aw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/az;->a:Lcom/roidapp/cloudlib/sns/basepost/aw;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/aw;->a(Lcom/roidapp/cloudlib/sns/basepost/aw;)Lcom/roidapp/cloudlib/sns/basepost/bb;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/az;->a:Lcom/roidapp/cloudlib/sns/basepost/aw;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/aw;->a(Lcom/roidapp/cloudlib/sns/basepost/aw;)Lcom/roidapp/cloudlib/sns/basepost/bb;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/bb;->a()V

    .line 84
    :cond_0
    return-void
.end method
