.class final Lcom/facebook/contacts/server/e;
.super Ljava/lang/Object;
.source "CreateContactClaimParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/server/CreateContactClaimParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/CreateContactClaimParams;
    .locals 2

    .prologue
    .line 58
    new-instance v0, Lcom/facebook/contacts/server/CreateContactClaimParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/server/CreateContactClaimParams;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/e;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/server/CreateContactClaimParams;
    .locals 1

    .prologue
    .line 62
    new-array v0, p1, [Lcom/facebook/contacts/server/CreateContactClaimParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/e;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/CreateContactClaimParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/e;->a(I)[Lcom/facebook/contacts/server/CreateContactClaimParams;

    move-result-object v0

    return-object v0
.end method
