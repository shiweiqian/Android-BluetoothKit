package com.inuker.bluetooth.library.connect.request;

import com.inuker.bluetooth.library.BleResponseWrapper;

/**
 * Created by liwentian on 2015/12/23.
 */
public class BleReadRssiRequest extends BleRequest {

    public BleReadRssiRequest(BleResponseWrapper response) {
        super(response);
        mRequestType = REQUEST_TYPE_READ_RSSI;
    }
}