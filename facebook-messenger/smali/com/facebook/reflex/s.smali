.class public final enum Lcom/facebook/reflex/s;
.super Ljava/lang/Enum;
.source "GestureEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/s;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/s;

.field public static final enum Longpress:Lcom/facebook/reflex/s;

.field public static final enum Pan:Lcom/facebook/reflex/s;

.field public static final enum Tap:Lcom/facebook/reflex/s;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 8
    new-instance v0, Lcom/facebook/reflex/s;

    const-string v1, "Tap"

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/s;->Tap:Lcom/facebook/reflex/s;

    .line 9
    new-instance v0, Lcom/facebook/reflex/s;

    const-string v1, "Pan"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/s;->Pan:Lcom/facebook/reflex/s;

    .line 10
    new-instance v0, Lcom/facebook/reflex/s;

    const-string v1, "Longpress"

    invoke-direct {v0, v1, v4}, Lcom/facebook/reflex/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/s;->Longpress:Lcom/facebook/reflex/s;

    .line 7
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/reflex/s;

    sget-object v1, Lcom/facebook/reflex/s;->Tap:Lcom/facebook/reflex/s;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/reflex/s;->Pan:Lcom/facebook/reflex/s;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/reflex/s;->Longpress:Lcom/facebook/reflex/s;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/reflex/s;->$VALUES:[Lcom/facebook/reflex/s;

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
    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/s;
    .locals 1

    .prologue
    .line 7
    const-class v0, Lcom/facebook/reflex/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/s;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/s;
    .locals 1

    .prologue
    .line 7
    sget-object v0, Lcom/facebook/reflex/s;->$VALUES:[Lcom/facebook/reflex/s;

    invoke-virtual {v0}, [Lcom/facebook/reflex/s;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/s;

    return-object v0
.end method
