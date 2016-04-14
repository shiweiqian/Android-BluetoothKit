package com.inuker.bluetooth.library.connect.request;

import com.inuker.bluetooth.library.BleResponseWrapper;

import java.util.UUID;

/**
 * Created by liwentian on 2015/11/6.
 */
public class BleNotifyRequest extends BleRequest {

    public BleNotifyRequest(UUID service, UUID character, BleResponseWrapper response) {
        super(response);
        mRequestType = REQUEST_TYPE_NOTIFY;
        mServiceUUID = service;
        mCharacterUUID = character;
    }
}