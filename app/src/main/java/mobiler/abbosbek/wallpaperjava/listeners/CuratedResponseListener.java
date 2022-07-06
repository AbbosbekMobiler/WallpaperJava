package mobiler.abbosbek.wallpaperjava.listeners;

import mobiler.abbosbek.wallpaperjava.model.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response,String message);
    void onError(String message);
}
