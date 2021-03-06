package edson.com.imotosconductor.Services;


import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import edson.com.imotosconductor.utiles.Token;

public class FirebaseService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshToken = FirebaseInstanceId.getInstance().getToken();
        Token.currentToken=refreshToken;
    }
}
