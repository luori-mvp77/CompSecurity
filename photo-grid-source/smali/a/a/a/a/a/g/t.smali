.class public final enum La/a/a/a/a/g/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "La/a/a/a/a/g/t;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/a/a/a/a/g/t;

.field public static final enum b:La/a/a/a/a/g/t;

.field public static final enum c:La/a/a/a/a/g/t;

.field private static final synthetic d:[La/a/a/a/a/g/t;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 30
    new-instance v0, La/a/a/a/a/g/t;

    const-string v1, "USE_CACHE"

    invoke-direct {v0, v1, v2}, La/a/a/a/a/g/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/g/t;->a:La/a/a/a/a/g/t;

    .line 35
    new-instance v0, La/a/a/a/a/g/t;

    const-string v1, "SKIP_CACHE_LOOKUP"

    invoke-direct {v0, v1, v3}, La/a/a/a/a/g/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/g/t;->b:La/a/a/a/a/g/t;

    .line 40
    new-instance v0, La/a/a/a/a/g/t;

    const-string v1, "IGNORE_CACHE_EXPIRATION"

    invoke-direct {v0, v1, v4}, La/a/a/a/a/g/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/g/t;->c:La/a/a/a/a/g/t;

    .line 25
    const/4 v0, 0x3

    new-array v0, v0, [La/a/a/a/a/g/t;

    sget-object v1, La/a/a/a/a/g/t;->a:La/a/a/a/a/g/t;

    aput-object v1, v0, v2

    sget-object v1, La/a/a/a/a/g/t;->b:La/a/a/a/a/g/t;

    aput-object v1, v0, v3

    sget-object v1, La/a/a/a/a/g/t;->c:La/a/a/a/a/g/t;

    aput-object v1, v0, v4

    sput-object v0, La/a/a/a/a/g/t;->d:[La/a/a/a/a/g/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/a/a/a/a/g/t;
    .locals 1

    .prologue
    .line 25
    const-class v0, La/a/a/a/a/g/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, La/a/a/a/a/g/t;

    return-object v0
.end method

.method public static values()[La/a/a/a/a/g/t;
    .locals 1

    .prologue
    .line 25
    sget-object v0, La/a/a/a/a/g/t;->d:[La/a/a/a/a/g/t;

    invoke-virtual {v0}, [La/a/a/a/a/g/t;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/a/a/a/a/g/t;

    return-object v0
.end method
