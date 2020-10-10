// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from OneWallProtocol.proto

package com.aspectgaming.media.onewall.data;

import javax.annotation.Generated;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Schema;

@Generated("java_bean")
public final class VideoInfo implements Externalizable, Message<VideoInfo>, Schema<VideoInfo>
{

    public static Schema<VideoInfo> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static VideoInfo getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final VideoInfo DEFAULT_INSTANCE = new VideoInfo();

    
    private long startTime;
    private long machineOffsetTime;
    private int x;
    private int y;
    private int loop;
    private String screen;
    private String file;
    private String mask;
    private float forcedFPS;

    public VideoInfo()
    {

    }

    @Override
    public String toString() {
        return "VideoInfo{" +
                    "startTime=" + startTime +
                    ", machineOffsetTime=" + machineOffsetTime +
                    ", x=" + x +
                    ", y=" + y +
                    ", loop=" + loop +
                    ", screen=" + screen +
                    ", file=" + file +
                    ", mask=" + mask +
                    ", forcedFPS=" + forcedFPS +
                '}';
    }
    // getters and setters

    // startTime

    public long getStartTime()
    {
        return startTime;
    }


    public void setStartTime(long startTime)
    {
        this.startTime = startTime;
    }

    // machineOffsetTime

    public long getMachineOffsetTime()
    {
        return machineOffsetTime;
    }


    public void setMachineOffsetTime(long machineOffsetTime)
    {
        this.machineOffsetTime = machineOffsetTime;
    }

    // x

    public int getX()
    {
        return x;
    }


    public void setX(int x)
    {
        this.x = x;
    }

    // y

    public int getY()
    {
        return y;
    }


    public void setY(int y)
    {
        this.y = y;
    }

    // loop

    public int getLoop()
    {
        return loop;
    }


    public void setLoop(int loop)
    {
        this.loop = loop;
    }

    // screen

    public String getScreen()
    {
        return screen;
    }


    public void setScreen(String screen)
    {
        this.screen = screen;
    }

    // file

    public String getFile()
    {
        return file;
    }


    public void setFile(String file)
    {
        this.file = file;
    }

    // mask

    public String getMask()
    {
        return mask;
    }


    public void setMask(String mask)
    {
        this.mask = mask;
    }

    // forcedFPS

    public float getForcedFPS()
    {
        return forcedFPS;
    }


    public void setForcedFPS(float forcedFPS)
    {
        this.forcedFPS = forcedFPS;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<VideoInfo> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public VideoInfo newMessage()
    {
        return new VideoInfo();
    }

    public Class<VideoInfo> typeClass()
    {
        return VideoInfo.class;
    }

    public String messageName()
    {
        return VideoInfo.class.getSimpleName();
    }

    public String messageFullName()
    {
        return VideoInfo.class.getName();
    }

    public boolean isInitialized(VideoInfo message)
    {
        return true;
    }

    public void mergeFrom(Input input, VideoInfo message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.startTime = input.readInt64();
                    break;
                case 2:
                    message.machineOffsetTime = input.readInt64();
                    break;
                case 3:
                    message.x = input.readInt32();
                    break;
                case 4:
                    message.y = input.readInt32();
                    break;
                case 5:
                    message.loop = input.readInt32();
                    break;
                case 6:
                    message.screen = input.readString();
                    break;
                case 7:
                    message.file = input.readString();
                    break;
                case 8:
                    message.mask = input.readString();
                    break;
                case 9:
                    message.forcedFPS = input.readFloat();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, VideoInfo message) throws IOException
    {
        if(message.startTime != 0)
            output.writeInt64(1, message.startTime, false);

        if(message.machineOffsetTime != 0)
            output.writeInt64(2, message.machineOffsetTime, false);

        if(message.x != 0)
            output.writeInt32(3, message.x, false);

        if(message.y != 0)
            output.writeInt32(4, message.y, false);

        if(message.loop != 0)
            output.writeInt32(5, message.loop, false);

        if(message.screen != null)
            output.writeString(6, message.screen, false);

        if(message.file != null)
            output.writeString(7, message.file, false);

        if(message.mask != null)
            output.writeString(8, message.mask, false);

        if(message.forcedFPS != 0)
            output.writeFloat(9, message.forcedFPS, false);
    }

    public String getFieldName(int number)
    {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name)
    {
        return Integer.parseInt(name);
    }
    
}
