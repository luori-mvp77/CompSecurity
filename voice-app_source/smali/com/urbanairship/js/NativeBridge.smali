.class public Lcom/urbanairship/js/NativeBridge;
.super Ljava/lang/Object;
.source "NativeBridge.java"


# static fields
.field private static hexDump:[B

.field private static source:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const/16 v0, 0x8b3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/urbanairship/js/NativeBridge;->hexDump:[B

    .line 19
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    sput-object v0, Lcom/urbanairship/js/NativeBridge;->source:Ljava/lang/String;

    return-void

    .line 15
    nop

    :array_0
    .array-data 1
        0x69t
        0x66t
        0x20t
        0x28t
        0x74t
        0x79t
        0x70t
        0x65t
        0x6ft
        0x66t
        0x20t
        0x55t
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x20t
        0x3dt
        0x3dt
        0x3dt
        0x20t
        0x27t
        0x75t
        0x6et
        0x64t
        0x65t
        0x66t
        0x69t
        0x6et
        0x65t
        0x64t
        0x27t
        0x29t
        0x20t
        0x7bt
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x55t
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x20t
        0x3dt
        0x20t
        0x28t
        0x66t
        0x75t
        0x6et
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x28t
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x76t
        0x61t
        0x72t
        0x20t
        0x75t
        0x72t
        0x62t
        0x61t
        0x6et
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x20t
        0x3dt
        0x20t
        0x7bt
        0x7dt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ft
        0x2ft
        0x20t
        0x50t
        0x72t
        0x6ft
        0x74t
        0x6ft
        0x74t
        0x79t
        0x70t
        0x69t
        0x6et
        0x67t
        0x20t
        0x64t
        0x6ft
        0x65t
        0x73t
        0x20t
        0x6et
        0x6ft
        0x74t
        0x20t
        0x77t
        0x6ft
        0x72t
        0x6bt
        0x20t
        0x66t
        0x6ft
        0x72t
        0x20t
        0x6et
        0x61t
        0x74t
        0x69t
        0x76t
        0x65t
        0x20t
        0x69t
        0x6et
        0x74t
        0x65t
        0x72t
        0x66t
        0x61t
        0x63t
        0x65t
        0x20t
        0x6ft
        0x62t
        0x6at
        0x65t
        0x63t
        0x74t
        0x73t
        0x20t
        0x61t
        0x6et
        0x64t
        0x20t
        0x62t
        0x75t
        0x67t
        0x73t
        0x20t
        0x65t
        0x78t
        0x69t
        0x73t
        0x74t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ft
        0x2ft
        0x20t
        0x74t
        0x68t
        0x61t
        0x74t
        0x20t
        0x70t
        0x72t
        0x65t
        0x76t
        0x65t
        0x6et
        0x74t
        0x20t
        0x4ft
        0x62t
        0x6at
        0x65t
        0x63t
        0x74t
        0x2et
        0x6bt
        0x65t
        0x79t
        0x73t
        0x28t
        0x29t
        0x20t
        0x66t
        0x72t
        0x6ft
        0x6dt
        0x20t
        0x77t
        0x6ft
        0x72t
        0x6bt
        0x69t
        0x6et
        0x67t
        0x2ct
        0x20t
        0x73t
        0x6ft
        0x20t
        0x77t
        0x65t
        0x20t
        0x61t
        0x72t
        0x65t
        0x20t
        0x77t
        0x6ft
        0x72t
        0x6bt
        0x69t
        0x6et
        0x67t
        0x20t
        0x61t
        0x72t
        0x6ft
        0x75t
        0x6et
        0x64t
        0x20t
        0x74t
        0x68t
        0x65t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ft
        0x2ft
        0x20t
        0x70t
        0x72t
        0x6ft
        0x62t
        0x6ct
        0x65t
        0x6dt
        0x20t
        0x62t
        0x79t
        0x20t
        0x65t
        0x78t
        0x70t
        0x6ct
        0x69t
        0x63t
        0x69t
        0x74t
        0x6ct
        0x79t
        0x20t
        0x6ct
        0x69t
        0x73t
        0x74t
        0x69t
        0x6et
        0x67t
        0x20t
        0x74t
        0x68t
        0x65t
        0x20t
        0x6dt
        0x65t
        0x74t
        0x68t
        0x6ft
        0x64t
        0x73t
        0x20t
        0x66t
        0x72t
        0x6ft
        0x6dt
        0x20t
        0x74t
        0x68t
        0x65t
        0x20t
        0x6et
        0x61t
        0x74t
        0x69t
        0x76t
        0x65t
        0x20t
        0x69t
        0x6et
        0x74t
        0x65t
        0x72t
        0x66t
        0x61t
        0x63t
        0x65t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ft
        0x2ft
        0x20t
        0x61t
        0x6et
        0x64t
        0x20t
        0x61t
        0x64t
        0x64t
        0x69t
        0x6et
        0x67t
        0x20t
        0x6dt
        0x65t
        0x74t
        0x68t
        0x6ft
        0x64t
        0x73t
        0x20t
        0x74t
        0x6ft
        0x20t
        0x6ft
        0x75t
        0x72t
        0x20t
        0x75t
        0x72t
        0x62t
        0x61t
        0x6et
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x20t
        0x6ft
        0x62t
        0x6at
        0x65t
        0x63t
        0x74t
        0x20t
        0x74t
        0x68t
        0x61t
        0x74t
        0x20t
        0x77t
        0x72t
        0x61t
        0x70t
        0x73t
        0x20t
        0x74t
        0x68t
        0x65t
        0x20t
        0x6dt
        0x65t
        0x74t
        0x68t
        0x6ft
        0x64t
        0x73t
        0x2et
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x76t
        0x61t
        0x72t
        0x20t
        0x6dt
        0x65t
        0x74t
        0x68t
        0x6ft
        0x64t
        0x73t
        0x20t
        0x3dt
        0x20t
        0x5bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x27t
        0x67t
        0x65t
        0x74t
        0x44t
        0x65t
        0x76t
        0x69t
        0x63t
        0x65t
        0x4dt
        0x6ft
        0x64t
        0x65t
        0x6ct
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x67t
        0x65t
        0x74t
        0x4dt
        0x65t
        0x73t
        0x73t
        0x61t
        0x67t
        0x65t
        0x49t
        0x64t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x67t
        0x65t
        0x74t
        0x4dt
        0x65t
        0x73t
        0x73t
        0x61t
        0x67t
        0x65t
        0x54t
        0x69t
        0x74t
        0x6ct
        0x65t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x67t
        0x65t
        0x74t
        0x4dt
        0x65t
        0x73t
        0x73t
        0x61t
        0x67t
        0x65t
        0x53t
        0x65t
        0x6et
        0x74t
        0x44t
        0x61t
        0x74t
        0x65t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x67t
        0x65t
        0x74t
        0x4dt
        0x65t
        0x73t
        0x73t
        0x61t
        0x67t
        0x65t
        0x53t
        0x65t
        0x6et
        0x74t
        0x44t
        0x61t
        0x74t
        0x65t
        0x4dt
        0x53t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x67t
        0x65t
        0x74t
        0x55t
        0x73t
        0x65t
        0x72t
        0x49t
        0x64t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x63t
        0x6ct
        0x6ft
        0x73t
        0x65t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x67t
        0x65t
        0x74t
        0x56t
        0x69t
        0x65t
        0x77t
        0x48t
        0x65t
        0x69t
        0x67t
        0x68t
        0x74t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x67t
        0x65t
        0x74t
        0x56t
        0x69t
        0x65t
        0x77t
        0x57t
        0x69t
        0x64t
        0x74t
        0x68t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x67t
        0x65t
        0x74t
        0x44t
        0x65t
        0x76t
        0x69t
        0x63t
        0x65t
        0x4ft
        0x72t
        0x69t
        0x65t
        0x6et
        0x74t
        0x61t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x6et
        0x61t
        0x76t
        0x69t
        0x67t
        0x61t
        0x74t
        0x65t
        0x54t
        0x6ft
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x69t
        0x73t
        0x4dt
        0x65t
        0x73t
        0x73t
        0x61t
        0x67t
        0x65t
        0x52t
        0x65t
        0x61t
        0x64t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x6dt
        0x61t
        0x72t
        0x6bt
        0x4dt
        0x65t
        0x73t
        0x73t
        0x61t
        0x67t
        0x65t
        0x52t
        0x65t
        0x61t
        0x64t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x27t
        0x6dt
        0x61t
        0x72t
        0x6bt
        0x4dt
        0x65t
        0x73t
        0x73t
        0x61t
        0x67t
        0x65t
        0x55t
        0x6et
        0x72t
        0x65t
        0x61t
        0x64t
        0x27t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x5dt
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x6dt
        0x65t
        0x74t
        0x68t
        0x6ft
        0x64t
        0x73t
        0x2et
        0x66t
        0x6ft
        0x72t
        0x45t
        0x61t
        0x63t
        0x68t
        0x28t
        0x66t
        0x75t
        0x6et
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x28t
        0x6et
        0x61t
        0x6dt
        0x65t
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x75t
        0x72t
        0x62t
        0x61t
        0x6et
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x5bt
        0x6et
        0x61t
        0x6dt
        0x65t
        0x5dt
        0x20t
        0x3dt
        0x20t
        0x66t
        0x75t
        0x6et
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x28t
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x76t
        0x61t
        0x72t
        0x20t
        0x76t
        0x61t
        0x6ct
        0x20t
        0x3dt
        0x20t
        0x5ft
        0x55t
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x5bt
        0x6et
        0x61t
        0x6dt
        0x65t
        0x5dt
        0x2et
        0x61t
        0x70t
        0x70t
        0x6ct
        0x79t
        0x28t
        0x5ft
        0x55t
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x2ct
        0x20t
        0x61t
        0x72t
        0x67t
        0x75t
        0x6dt
        0x65t
        0x6et
        0x74t
        0x73t
        0x29t
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x72t
        0x65t
        0x74t
        0x75t
        0x72t
        0x6et
        0x20t
        0x74t
        0x79t
        0x70t
        0x65t
        0x6ft
        0x66t
        0x20t
        0x76t
        0x61t
        0x6ct
        0x20t
        0x3dt
        0x3dt
        0x3dt
        0x20t
        0x27t
        0x75t
        0x6et
        0x64t
        0x65t
        0x66t
        0x69t
        0x6et
        0x65t
        0x64t
        0x27t
        0x20t
        0x3ft
        0x20t
        0x20t
        0x6et
        0x75t
        0x6ct
        0x6ct
        0x20t
        0x3at
        0x20t
        0x76t
        0x61t
        0x6ct
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0x29t
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x76t
        0x61t
        0x72t
        0x20t
        0x61t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x43t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x73t
        0x20t
        0x3dt
        0x20t
        0x7bt
        0x7dt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x49t
        0x44t
        0x20t
        0x3dt
        0x20t
        0x30t
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x75t
        0x72t
        0x62t
        0x61t
        0x6et
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x2et
        0x72t
        0x75t
        0x6et
        0x41t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x20t
        0x3dt
        0x20t
        0x66t
        0x75t
        0x6et
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x28t
        0x61t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x4et
        0x61t
        0x6dt
        0x65t
        0x2ct
        0x20t
        0x61t
        0x72t
        0x67t
        0x75t
        0x6dt
        0x65t
        0x6et
        0x74t
        0x2ct
        0x20t
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x76t
        0x61t
        0x72t
        0x20t
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x4bt
        0x65t
        0x79t
        0x20t
        0x3dt
        0x20t
        0x27t
        0x75t
        0x61t
        0x2dt
        0x63t
        0x62t
        0x2dt
        0x27t
        0x20t
        0x2bt
        0x20t
        0x28t
        0x2bt
        0x2bt
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x49t
        0x44t
        0x29t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ct
        0x20t
        0x61t
        0x72t
        0x67t
        0x50t
        0x61t
        0x79t
        0x6ct
        0x6ft
        0x61t
        0x64t
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x61t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x43t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x73t
        0x5bt
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x4bt
        0x65t
        0x79t
        0x5dt
        0x20t
        0x3dt
        0x20t
        0x66t
        0x75t
        0x6et
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x28t
        0x65t
        0x72t
        0x72t
        0x2ct
        0x20t
        0x64t
        0x61t
        0x74t
        0x61t
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x69t
        0x66t
        0x28t
        0x65t
        0x72t
        0x72t
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x72t
        0x65t
        0x74t
        0x75t
        0x72t
        0x6et
        0x20t
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x28t
        0x65t
        0x72t
        0x72t
        0x29t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x74t
        0x72t
        0x79t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x69t
        0x66t
        0x28t
        0x64t
        0x61t
        0x74t
        0x61t
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x64t
        0x61t
        0x74t
        0x61t
        0x20t
        0x3dt
        0x20t
        0x4at
        0x53t
        0x4ft
        0x4et
        0x2et
        0x70t
        0x61t
        0x72t
        0x73t
        0x65t
        0x28t
        0x64t
        0x61t
        0x74t
        0x61t
        0x29t
        0x2et
        0x76t
        0x61t
        0x6ct
        0x75t
        0x65t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0x20t
        0x63t
        0x61t
        0x74t
        0x63t
        0x68t
        0x28t
        0x65t
        0x72t
        0x72t
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x72t
        0x65t
        0x74t
        0x75t
        0x72t
        0x6et
        0x20t
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x28t
        0x6et
        0x65t
        0x77t
        0x20t
        0x45t
        0x72t
        0x72t
        0x6ft
        0x72t
        0x28t
        0x27t
        0x63t
        0x6ft
        0x75t
        0x6ct
        0x64t
        0x20t
        0x6et
        0x6ft
        0x74t
        0x20t
        0x64t
        0x65t
        0x63t
        0x6ft
        0x64t
        0x65t
        0x20t
        0x72t
        0x65t
        0x73t
        0x70t
        0x6ft
        0x6et
        0x73t
        0x65t
        0x3at
        0x20t
        0x27t
        0x20t
        0x2bt
        0x20t
        0x64t
        0x61t
        0x74t
        0x61t
        0x29t
        0x29t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x28t
        0x6et
        0x75t
        0x6ct
        0x6ct
        0x2ct
        0x20t
        0x64t
        0x61t
        0x74t
        0x61t
        0x29t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x61t
        0x72t
        0x67t
        0x50t
        0x61t
        0x79t
        0x6ct
        0x6ft
        0x61t
        0x64t
        0x20t
        0x3dt
        0x20t
        0x7bt
        0x76t
        0x61t
        0x6ct
        0x75t
        0x65t
        0x3at
        0x20t
        0x61t
        0x72t
        0x67t
        0x75t
        0x6dt
        0x65t
        0x6et
        0x74t
        0x7dt
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x5ft
        0x55t
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x2et
        0x61t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x43t
        0x61t
        0x6ct
        0x6ct
        0x28t
        0x61t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x4et
        0x61t
        0x6dt
        0x65t
        0x2ct
        0x20t
        0x4at
        0x53t
        0x4ft
        0x4et
        0x2et
        0x73t
        0x74t
        0x72t
        0x69t
        0x6et
        0x67t
        0x69t
        0x66t
        0x79t
        0x28t
        0x61t
        0x72t
        0x67t
        0x50t
        0x61t
        0x79t
        0x6ct
        0x6ft
        0x61t
        0x64t
        0x29t
        0x2ct
        0x20t
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x4bt
        0x65t
        0x79t
        0x29t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x75t
        0x72t
        0x62t
        0x61t
        0x6et
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0x2et
        0x66t
        0x69t
        0x6et
        0x69t
        0x73t
        0x68t
        0x41t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x20t
        0x3dt
        0x20t
        0x66t
        0x75t
        0x6et
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x28t
        0x65t
        0x72t
        0x72t
        0x2ct
        0x20t
        0x64t
        0x61t
        0x74t
        0x61t
        0x2ct
        0x20t
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x4bt
        0x65t
        0x79t
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x69t
        0x66t
        0x28t
        0x61t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x43t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x73t
        0x5bt
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x4bt
        0x65t
        0x79t
        0x5dt
        0x29t
        0x20t
        0x7bt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x61t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x43t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x73t
        0x5bt
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x4bt
        0x65t
        0x79t
        0x5dt
        0x28t
        0x65t
        0x72t
        0x72t
        0x2ct
        0x20t
        0x64t
        0x61t
        0x74t
        0x61t
        0x29t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x64t
        0x65t
        0x6ct
        0x65t
        0x74t
        0x65t
        0x20t
        0x61t
        0x63t
        0x74t
        0x69t
        0x6ft
        0x6et
        0x43t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x73t
        0x5bt
        0x63t
        0x61t
        0x6ct
        0x6ct
        0x62t
        0x61t
        0x63t
        0x6bt
        0x4bt
        0x65t
        0x79t
        0x5dt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x20t
        0x72t
        0x65t
        0x74t
        0x75t
        0x72t
        0x6et
        0x20t
        0x75t
        0x72t
        0x62t
        0x61t
        0x6et
        0x41t
        0x69t
        0x72t
        0x73t
        0x68t
        0x69t
        0x70t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x7dt
        0x29t
        0x28t
        0x29t
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x2ft
        0x2ft
        0x20t
        0x46t
        0x69t
        0x72t
        0x65t
        0x20t
        0x74t
        0x68t
        0x65t
        0x20t
        0x72t
        0x65t
        0x61t
        0x64t
        0x79t
        0x20t
        0x65t
        0x76t
        0x65t
        0x6et
        0x74t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x76t
        0x61t
        0x72t
        0x20t
        0x75t
        0x61t
        0x4ct
        0x69t
        0x62t
        0x72t
        0x61t
        0x72t
        0x79t
        0x52t
        0x65t
        0x61t
        0x64t
        0x79t
        0x45t
        0x76t
        0x65t
        0x6et
        0x74t
        0x20t
        0x3dt
        0x20t
        0x64t
        0x6ft
        0x63t
        0x75t
        0x6dt
        0x65t
        0x6et
        0x74t
        0x2et
        0x63t
        0x72t
        0x65t
        0x61t
        0x74t
        0x65t
        0x45t
        0x76t
        0x65t
        0x6et
        0x74t
        0x28t
        0x27t
        0x45t
        0x76t
        0x65t
        0x6et
        0x74t
        0x27t
        0x29t
        0xat
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x75t
        0x61t
        0x4ct
        0x69t
        0x62t
        0x72t
        0x61t
        0x72t
        0x79t
        0x52t
        0x65t
        0x61t
        0x64t
        0x79t
        0x45t
        0x76t
        0x65t
        0x6et
        0x74t
        0x2et
        0x69t
        0x6et
        0x69t
        0x74t
        0x45t
        0x76t
        0x65t
        0x6et
        0x74t
        0x28t
        0x27t
        0x75t
        0x61t
        0x6ct
        0x69t
        0x62t
        0x72t
        0x61t
        0x72t
        0x79t
        0x72t
        0x65t
        0x61t
        0x64t
        0x79t
        0x27t
        0x2ct
        0x20t
        0x74t
        0x72t
        0x75t
        0x65t
        0x2ct
        0x20t
        0x74t
        0x72t
        0x75t
        0x65t
        0x29t
        0xat
        0x20t
        0x20t
        0x20t
        0x20t
        0x64t
        0x6ft
        0x63t
        0x75t
        0x6dt
        0x65t
        0x6et
        0x74t
        0x2et
        0x64t
        0x69t
        0x73t
        0x70t
        0x61t
        0x74t
        0x63t
        0x68t
        0x45t
        0x76t
        0x65t
        0x6et
        0x74t
        0x28t
        0x75t
        0x61t
        0x4ct
        0x69t
        0x62t
        0x72t
        0x61t
        0x72t
        0x79t
        0x52t
        0x65t
        0x61t
        0x64t
        0x79t
        0x45t
        0x76t
        0x65t
        0x6et
        0x74t
        0x29t
        0xat
        0x7dt
        0xat
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getJavaScriptSource()Ljava/lang/String;
    .locals 4

    .prologue
    .line 27
    sget-object v1, Lcom/urbanairship/js/NativeBridge;->source:Ljava/lang/String;

    invoke-static {v1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 29
    :try_start_0
    new-instance v1, Ljava/lang/String;

    sget-object v2, Lcom/urbanairship/js/NativeBridge;->hexDump:[B

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    sput-object v1, Lcom/urbanairship/js/NativeBridge;->source:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .local v0, "ex":Ljava/io/UnsupportedEncodingException;
    :cond_0
    :goto_0
    sget-object v1, Lcom/urbanairship/js/NativeBridge;->source:Ljava/lang/String;

    return-object v1

    .line 30
    .end local v0    # "ex":Ljava/io/UnsupportedEncodingException;
    :catch_0
    move-exception v0

    .line 32
    .restart local v0    # "ex":Ljava/io/UnsupportedEncodingException;
    const-string v1, "Unable to decode NativeBridge source."

    invoke-static {v1}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_0
.end method
