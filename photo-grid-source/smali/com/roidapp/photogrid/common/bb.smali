.class public final Lcom/roidapp/photogrid/common/bb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 43
    :try_start_0
    new-instance v0, Landroid/media/ExifInterface;

    invoke-direct {v0, p0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 44
    const-string v1, "Orientation"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 45
    packed-switch v0, :pswitch_data_0

    .line 57
    :goto_0
    :pswitch_0
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 47
    :pswitch_1
    const/16 v0, 0x5a

    goto :goto_1

    .line 49
    :pswitch_2
    const/16 v0, 0xb4

    goto :goto_1

    .line 51
    :pswitch_3
    const/16 v0, 0x10e

    goto :goto_1

    .line 55
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 45
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public static a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 18
    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 35
    :cond_1
    :goto_0
    return-object p0

    .line 21
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-le v0, v1, :cond_1

    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    .line 26
    invoke-static {p1}, Lcom/roidapp/photogrid/common/bb;->a(Ljava/lang/String;)I

    move-result v0

    .line 28
    :cond_3
    if-lez v0, :cond_1

    .line 29
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/VerifyError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/VerifyError;->printStackTrace()V

    goto :goto_0
.end method
