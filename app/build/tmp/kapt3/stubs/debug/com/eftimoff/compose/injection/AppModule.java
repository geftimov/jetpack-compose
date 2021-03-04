package com.eftimoff.compose.injection;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/eftimoff/compose/injection/AppModule;", "", "()V", "provideReceiptApi", "Lcom/eftimoff/compose/api/ReceiptApi;", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.eftimoff.compose.api.ReceiptApi provideReceiptApi() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}