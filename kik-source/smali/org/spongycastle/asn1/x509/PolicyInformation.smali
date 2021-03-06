.class public Lorg/spongycastle/asn1/x509/PolicyInformation;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private b:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 18
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 19
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad sequence size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/PolicyInformation;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 27
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-le v0, v2, :cond_2

    .line 29
    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/PolicyInformation;->b:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 31
    :cond_2
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/PolicyInformation;
    .locals 2

    .prologue
    .line 50
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/x509/PolicyInformation;

    if-eqz v0, :cond_1

    .line 52
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/x509/PolicyInformation;

    .line 55
    :goto_0
    return-object p0

    :cond_1
    new-instance v0, Lorg/spongycastle/asn1/x509/PolicyInformation;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/PolicyInformation;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 76
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 78
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/PolicyInformation;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 80
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/PolicyInformation;->b:Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v1, :cond_0

    .line 82
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/PolicyInformation;->b:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 85
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/PolicyInformation;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Sequence;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/PolicyInformation;->b:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method
