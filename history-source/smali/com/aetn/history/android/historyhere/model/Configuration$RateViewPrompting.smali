.class public Lcom/aetn/history/android/historyhere/model/Configuration$RateViewPrompting;
.super Ljava/lang/Object;
.source "Configuration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RateViewPrompting"
.end annotation


# instance fields
.field public POIViewCount:I

.field public daysBetweenPrompts:I

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/Configuration;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/model/Configuration;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/Configuration;

    .prologue
    .line 61
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/Configuration$RateViewPrompting;->this$0:Lcom/aetn/history/android/historyhere/model/Configuration;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
