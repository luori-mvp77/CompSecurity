.class Lcom/facebook/contacts/u;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/upload/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 701
    iput-object p1, p0, Lcom/facebook/contacts/u;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 701
    invoke-direct {p0, p1}, Lcom/facebook/contacts/u;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/upload/f;
    .locals 12

    .prologue
    .line 706
    new-instance v0, Lcom/facebook/contacts/upload/f;

    const-class v1, Lcom/facebook/contacts/e/e;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/u;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/u;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Lcom/facebook/contacts/g/k;

    invoke-virtual {p0, v3}, Lcom/facebook/contacts/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/contacts/g/k;

    const-class v4, Lcom/facebook/contacts/g/i;

    invoke-virtual {p0, v4}, Lcom/facebook/contacts/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/contacts/g/i;

    const-class v5, Lcom/facebook/contacts/data/m;

    invoke-virtual {p0, v5}, Lcom/facebook/contacts/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/contacts/data/m;

    const-class v6, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v6}, Lcom/facebook/contacts/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/prefs/shared/d;

    const-class v7, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0, v7}, Lcom/facebook/contacts/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/contacts/data/k;

    const-class v8, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {p0, v8}, Lcom/facebook/contacts/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    const-class v9, Lcom/facebook/contacts/b/a;

    invoke-virtual {p0, v9}, Lcom/facebook/contacts/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/contacts/b/a;

    const-class v10, Ljava/lang/Boolean;

    const-class v11, Lcom/facebook/contacts/annotations/IsContactEventsUploadPermitted;

    invoke-virtual {p0, v10, v11}, Lcom/facebook/contacts/u;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v10

    const-class v11, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v11}, Lcom/facebook/contacts/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct/range {v0 .. v11}, Lcom/facebook/contacts/upload/f;-><init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/contacts/g/k;Lcom/facebook/contacts/g/i;Lcom/facebook/contacts/data/m;Lcom/facebook/prefs/shared/d;Lcom/facebook/contacts/data/k;Lcom/facebook/phonenumbers/PhoneNumberUtil;Lcom/facebook/contacts/b/a;Ljavax/inject/a;Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 701
    invoke-virtual {p0}, Lcom/facebook/contacts/u;->a()Lcom/facebook/contacts/upload/f;

    move-result-object v0

    return-object v0
.end method
