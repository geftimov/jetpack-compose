-if class com.eftimoff.compose.api.Receipts
-keepnames class com.eftimoff.compose.api.Receipts
-if class com.eftimoff.compose.api.Receipts
-keep class com.eftimoff.compose.api.ReceiptsJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
