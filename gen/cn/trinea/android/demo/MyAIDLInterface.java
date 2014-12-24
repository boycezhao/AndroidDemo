/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/boycezhao/Documents/AndroidDemo/src/cn/trinea/android/demo/MyAIDLInterface.aidl
 */
package cn.trinea.android.demo;
/**
 * @author Trinea 2012-9-25
 */
public interface MyAIDLInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cn.trinea.android.demo.MyAIDLInterface
{
private static final java.lang.String DESCRIPTOR = "cn.trinea.android.demo.MyAIDLInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cn.trinea.android.demo.MyAIDLInterface interface,
 * generating a proxy if needed.
 */
public static cn.trinea.android.demo.MyAIDLInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cn.trinea.android.demo.MyAIDLInterface))) {
return ((cn.trinea.android.demo.MyAIDLInterface)iin);
}
return new cn.trinea.android.demo.MyAIDLInterface.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setCount:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setCount(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cn.trinea.android.demo.MyAIDLInterface
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public int getCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setCount(int count) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(count);
mRemote.transact(Stub.TRANSACTION_setCount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public int getCount() throws android.os.RemoteException;
public void setCount(int count) throws android.os.RemoteException;
}
