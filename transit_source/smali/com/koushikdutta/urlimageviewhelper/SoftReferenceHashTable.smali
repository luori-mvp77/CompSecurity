.class public Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;
.super Ljava/lang/Object;
.source "SoftReferenceHashTable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field mTable:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<TK;",
            "Ljava/lang/ref/SoftReference",
            "<TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 6
    .local p0, "this":Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;, "Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable<TK;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;->mTable:Ljava/util/Hashtable;

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .prologue
    .line 17
    .local p0, "this":Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;, "Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    iget-object v2, p0, Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;->mTable:Ljava/util/Hashtable;

    invoke-virtual {v2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 18
    .local v1, "val":Ljava/lang/ref/SoftReference;, "Ljava/lang/ref/SoftReference<TV;>;"
    if-nez v1, :cond_1

    .line 19
    const/4 v0, 0x0

    .line 23
    :cond_0
    :goto_0
    return-object v0

    .line 20
    :cond_1
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    .line 21
    .local v0, "ret":Ljava/lang/Object;, "TV;"
    if-nez v0, :cond_0

    .line 22
    iget-object v2, p0, Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;->mTable:Ljava/util/Hashtable;

    invoke-virtual {v2, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 10
    .local p0, "this":Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;, "Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    iget-object v1, p0, Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;->mTable:Ljava/util/Hashtable;

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 11
    .local v0, "old":Ljava/lang/ref/SoftReference;, "Ljava/lang/ref/SoftReference<TV;>;"
    if-nez v0, :cond_0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .prologue
    .line 27
    .local p0, "this":Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;, "Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable<TK;TV;>;"
    .local p1, "k":Ljava/lang/Object;, "TK;"
    iget-object v1, p0, Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;->mTable:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 28
    .local v0, "v":Ljava/lang/ref/SoftReference;, "Ljava/lang/ref/SoftReference<TV;>;"
    if-nez v0, :cond_0

    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0
.end method
