.class final Lcom/google/android/gms/c/h;
.super Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field final synthetic a:Lcom/google/android/gms/c/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/c/f;)V
    .locals 8

    const/4 v2, 0x1

    iput-object p1, p0, Lcom/google/android/gms/c/h;->a:Lcom/google/android/gms/c/f;

    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v1, p0

    move v3, v2

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    new-instance v0, Lcom/google/android/gms/c/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/c/j;-><init>(B)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/c/h;->setThreadFactory(Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method


# virtual methods
.method protected final newTaskFor(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/RunnableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Ljava/util/concurrent/RunnableFuture",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/c/i;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/c/i;-><init>(Lcom/google/android/gms/c/h;Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-object v0
.end method
