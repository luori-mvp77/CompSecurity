.class Lcom/google/android/gms/games/internal/api/PlayersImpl$22;
.super Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadPlayersImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/PlayersImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aaR:Ljava/lang/String;

.field final synthetic aar:I

.field final synthetic aba:Ljava/lang/String;


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/PlayersImpl$22;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 7

    iget-object v2, p0, Lcom/google/android/gms/games/internal/api/PlayersImpl$22;->aba:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/games/internal/api/PlayersImpl$22;->aaR:Ljava/lang/String;

    iget v4, p0, Lcom/google/android/gms/games/internal/api/PlayersImpl$22;->aar:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/games/internal/GamesClientImpl;->b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;IZZ)V

    return-void
.end method
