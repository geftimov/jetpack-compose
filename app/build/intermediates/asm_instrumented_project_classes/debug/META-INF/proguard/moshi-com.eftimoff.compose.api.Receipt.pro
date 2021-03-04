-if class com.eftimoff.compose.api.Receipt
-keepnames class com.eftimoff.compose.api.Receipt
-if class com.eftimoff.compose.api.Receipt
-keep class com.eftimoff.compose.api.ReceiptJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.eftimoff.compose.api.Receipt
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.eftimoff.compose.api.Receipt
-keepclassmembers class com.eftimoff.compose.api.Receipt {
    public synthetic <init>(int,int,java.lang.String,int,java.lang.String,java.lang.String,java.util.List,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
