// Generated by Dagger (https://dagger.dev).
package com.eftimoff.compose.viewmodel;

import com.eftimoff.compose.api.ReceiptApi;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<ReceiptApi> apiProvider;

  public MainViewModel_Factory(Provider<ReceiptApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(apiProvider.get());
  }

  public static MainViewModel_Factory create(Provider<ReceiptApi> apiProvider) {
    return new MainViewModel_Factory(apiProvider);
  }

  public static MainViewModel newInstance(ReceiptApi api) {
    return new MainViewModel(api);
  }
}
