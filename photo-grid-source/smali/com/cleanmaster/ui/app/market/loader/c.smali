.class final Lcom/cleanmaster/ui/app/market/loader/c;
.super Lcom/cleanmaster/ui/app/market/loader/h;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;)V
    .locals 1

    .prologue
    .line 232
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/loader/c;->a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/cleanmaster/ui/app/market/loader/h;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 234
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/c;->a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->a(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 236
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 237
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/c;->a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/c;->a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    iget-object v2, p0, Lcom/cleanmaster/ui/app/market/loader/c;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->a([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->a(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
