package com.eftimoff.compose.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/eftimoff/compose/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "api", "Lcom/eftimoff/compose/api/ReceiptApi;", "(Lcom/eftimoff/compose/api/ReceiptApi;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/eftimoff/compose/viewmodel/MainViewModel$State;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "State", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.eftimoff.compose.viewmodel.MainViewModel.State> _state = null;
    private final com.eftimoff.compose.api.ReceiptApi api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.eftimoff.compose.viewmodel.MainViewModel.State> getState() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.eftimoff.compose.api.ReceiptApi api) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/eftimoff/compose/viewmodel/MainViewModel$State;", "", "()V", "Content", "Error", "Loading", "Lcom/eftimoff/compose/viewmodel/MainViewModel$State$Loading;", "Lcom/eftimoff/compose/viewmodel/MainViewModel$State$Content;", "Lcom/eftimoff/compose/viewmodel/MainViewModel$State$Error;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/eftimoff/compose/viewmodel/MainViewModel$State$Loading;", "Lcom/eftimoff/compose/viewmodel/MainViewModel$State;", "()V", "app_debug"})
        public static final class Loading extends com.eftimoff.compose.viewmodel.MainViewModel.State {
            @org.jetbrains.annotations.NotNull()
            public static final com.eftimoff.compose.viewmodel.MainViewModel.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/eftimoff/compose/viewmodel/MainViewModel$State$Content;", "Lcom/eftimoff/compose/viewmodel/MainViewModel$State;", "receipts", "", "Lcom/eftimoff/compose/api/Receipt;", "(Ljava/util/List;)V", "getReceipts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Content extends com.eftimoff.compose.viewmodel.MainViewModel.State {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.eftimoff.compose.api.Receipt> receipts = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.eftimoff.compose.api.Receipt> getReceipts() {
                return null;
            }
            
            public Content(@org.jetbrains.annotations.NotNull()
            java.util.List<com.eftimoff.compose.api.Receipt> receipts) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.eftimoff.compose.api.Receipt> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.eftimoff.compose.viewmodel.MainViewModel.State.Content copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.eftimoff.compose.api.Receipt> receipts) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/eftimoff/compose/viewmodel/MainViewModel$State$Error;", "Lcom/eftimoff/compose/viewmodel/MainViewModel$State;", "()V", "app_debug"})
        public static final class Error extends com.eftimoff.compose.viewmodel.MainViewModel.State {
            @org.jetbrains.annotations.NotNull()
            public static final com.eftimoff.compose.viewmodel.MainViewModel.State.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
    }
}