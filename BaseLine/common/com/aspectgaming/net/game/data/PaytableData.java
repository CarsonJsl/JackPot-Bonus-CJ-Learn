// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from GameProtocol.proto

package com.aspectgaming.net.game.data;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Schema;

public final class PaytableData implements Externalizable, Message<PaytableData>, Schema<PaytableData> {

    public static Schema<PaytableData> getSchema() {
        return DEFAULT_INSTANCE;
    }

    public static PaytableData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static final PaytableData DEFAULT_INSTANCE = new PaytableData();

    public List<SymbolPaysData> Symbols;

    public PaytableData() {}

    @Override
    public String toString() {
        return "PaytableData{" + "symbols=" + Symbols + '}';
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<PaytableData> cachedSchema() {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public PaytableData newMessage() {
        return new PaytableData();
    }

    public Class<PaytableData> typeClass() {
        return PaytableData.class;
    }

    public String messageName() {
        return PaytableData.class.getSimpleName();
    }

    public String messageFullName() {
        return PaytableData.class.getName();
    }

    public boolean isInitialized(PaytableData message) {
        return true;
    }

    public void mergeFrom(Input input, PaytableData message) throws IOException {
        try {
            for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this)) {
                switch (number) {
                case 0:
                    return;
                case 1:
                    if (message.Symbols == null) message.Symbols = new ArrayList<SymbolPaysData>();
                    message.Symbols.add(input.mergeObject(null, SymbolPaysData.getSchema()));
                    break;

                default:
                    input.handleUnknownField(number, this);
                }
            }
        } finally {
            if (message.Symbols != null) message.Symbols = java.util.Collections.unmodifiableList(message.Symbols);
            else message.Symbols = java.util.Collections.emptyList();
        }
    }

    public void writeTo(Output output, PaytableData message) throws IOException {
        if (message.Symbols != null) {
            for (SymbolPaysData symbols : message.Symbols) {
                if (symbols != null) output.writeObject(1, symbols, SymbolPaysData.getSchema(), true);
            }
        }

    }

    public String getFieldName(int number) {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name) {
        return Integer.parseInt(name);
    }

}
