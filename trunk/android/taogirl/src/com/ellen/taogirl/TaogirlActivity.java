package com.ellen.taogirl;

import android.app.Activity;
import android.os.Bundle;
import com.ellen.mcf.Resource;
import com.ellen.mcf.Logger;

public class TaogirlActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String test = Resource.mcfName(this);
        Logger.i("test", test);
    }
}