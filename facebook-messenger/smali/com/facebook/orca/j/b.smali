.class public Lcom/facebook/orca/j/b;
.super Ljava/lang/Object;
.source "TempFileCleanupServiceInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/orca/j/b;->a:Landroid/content/Context;

    .line 18
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/orca/j/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/orca/j/a;->a(Landroid/content/Context;)V

    .line 23
    return-void
.end method
