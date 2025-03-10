package org.ethereum.util;

import org.ethereum.crypto.ECKey;
import org.spongycastle.util.encoders.Hex;

public class GetNodeId {
    public static void main(String[] args) {
        String privateKeyHex = "94c49300a1d0509bc637f8dad3c1c0358aa841726d04f84e76755c82640c1800";
        byte[] privateKeyBytes = Hex.decode(privateKeyHex);
        
        ECKey key = ECKey.fromPrivate(privateKeyBytes);
        byte[] pubKey = key.getPubKey();
        byte[] nodeId = key.getNodeId();
        
        System.out.println("Public Key: 0x" + Hex.toHexString(pubKey));
        System.out.println("Node ID: " + Hex.toHexString(nodeId));
    }
}