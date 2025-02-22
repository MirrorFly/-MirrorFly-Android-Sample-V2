package com.contusfly.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.contusfly.database.model.ContusContact;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ContusContactDao_Impl implements ContusContactDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ContusContact> __insertionAdapterOfContusContact;

  private final EntityDeletionOrUpdateAdapter<ContusContact> __updateAdapterOfContusContact;

  private final SharedSQLiteStatement __preparedStmtOfDeleteContusContact;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllContusContacts;

  public ContusContactDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfContusContact = new EntityInsertionAdapter<ContusContact>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ContusContact` (`jid`,`name`,`image`,`mobileNumber`,`status`,`email`,`isMuted`,`isBlocked`,`isBlockedMe`,`isAdminBlocked`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ContusContact value) {
        if (value.getJid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getJid());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getMobileNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMobileNumber());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getStatus());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmail());
        }
        final Integer _tmp = value.isMuted() == null ? null : (value.isMuted() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        final Integer _tmp_1 = value.isBlocked() == null ? null : (value.isBlocked() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp_1);
        }
        final Integer _tmp_2 = value.isBlockedMe() == null ? null : (value.isBlockedMe() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp_2);
        }
        final Integer _tmp_3 = value.isAdminBlocked() == null ? null : (value.isAdminBlocked() ? 1 : 0);
        if (_tmp_3 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, _tmp_3);
        }
      }
    };
    this.__updateAdapterOfContusContact = new EntityDeletionOrUpdateAdapter<ContusContact>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `ContusContact` SET `jid` = ?,`name` = ?,`image` = ?,`mobileNumber` = ?,`status` = ?,`email` = ?,`isMuted` = ?,`isBlocked` = ?,`isBlockedMe` = ?,`isAdminBlocked` = ? WHERE `jid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ContusContact value) {
        if (value.getJid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getJid());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getMobileNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMobileNumber());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getStatus());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmail());
        }
        final Integer _tmp = value.isMuted() == null ? null : (value.isMuted() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        final Integer _tmp_1 = value.isBlocked() == null ? null : (value.isBlocked() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp_1);
        }
        final Integer _tmp_2 = value.isBlockedMe() == null ? null : (value.isBlockedMe() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp_2);
        }
        final Integer _tmp_3 = value.isAdminBlocked() == null ? null : (value.isAdminBlocked() ? 1 : 0);
        if (_tmp_3 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, _tmp_3);
        }
        if (value.getJid() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getJid());
        }
      }
    };
    this.__preparedStmtOfDeleteContusContact = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ContusContact WHERE jid = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllContusContacts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from ContusContact ";
        return _query;
      }
    };
  }

  @Override
  public Object insertContusContact(final ContusContact[] contusContact,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfContusContact.insert(contusContact);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void insertContusContactAsSingle(final ContusContact... contusContact) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfContusContact.insert(contusContact);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object insertContusContacts(final List<ContusContact> users,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfContusContact.insert(users);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAll(final ContusContact[] users,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfContusContact.insert(users);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateContusContact(final ContusContact contusContact,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfContusContact.handle(contusContact);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateContusContacts(final List<ContusContact> list,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfContusContact.handleMultiple(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteContusContact(final String jid,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteContusContact.acquire();
        int _argIndex = 1;
        if (jid == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, jid);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteContusContact.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public void deleteAllContusContacts() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllContusContacts.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllContusContacts.release(_stmt);
    }
  }

  @Override
  public ContusContact getContusContact(final String jid) {
    final String _sql = "SELECT * FROM ContusContact WHERE jid LIKE (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (jid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, jid);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfJid = CursorUtil.getColumnIndexOrThrow(_cursor, "jid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobileNumber");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfIsMuted = CursorUtil.getColumnIndexOrThrow(_cursor, "isMuted");
      final int _cursorIndexOfIsBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlocked");
      final int _cursorIndexOfIsBlockedMe = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlockedMe");
      final int _cursorIndexOfIsAdminBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isAdminBlocked");
      final ContusContact _result;
      if(_cursor.moveToFirst()) {
        final String _tmpJid;
        if (_cursor.isNull(_cursorIndexOfJid)) {
          _tmpJid = null;
        } else {
          _tmpJid = _cursor.getString(_cursorIndexOfJid);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final String _tmpMobileNumber;
        if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
          _tmpMobileNumber = null;
        } else {
          _tmpMobileNumber = _cursor.getString(_cursorIndexOfMobileNumber);
        }
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final Boolean _tmpIsMuted;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsMuted)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsMuted);
        }
        _tmpIsMuted = _tmp == null ? null : _tmp != 0;
        final Boolean _tmpIsBlocked;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsBlocked)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsBlocked);
        }
        _tmpIsBlocked = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpIsBlockedMe;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsBlockedMe)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsBlockedMe);
        }
        _tmpIsBlockedMe = _tmp_2 == null ? null : _tmp_2 != 0;
        final Boolean _tmpIsAdminBlocked;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfIsAdminBlocked)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfIsAdminBlocked);
        }
        _tmpIsAdminBlocked = _tmp_3 == null ? null : _tmp_3 != 0;
        _result = new ContusContact(_tmpJid,_tmpName,_tmpImage,_tmpMobileNumber,_tmpStatus,_tmpEmail,_tmpIsMuted,_tmpIsBlocked,_tmpIsBlockedMe,_tmpIsAdminBlocked);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object getAllContusContact(final Continuation<? super List<ContusContact>> continuation) {
    final String _sql = "SELECT * FROM ContusContact";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ContusContact>>() {
      @Override
      public List<ContusContact> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfJid = CursorUtil.getColumnIndexOrThrow(_cursor, "jid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobileNumber");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfIsMuted = CursorUtil.getColumnIndexOrThrow(_cursor, "isMuted");
          final int _cursorIndexOfIsBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlocked");
          final int _cursorIndexOfIsBlockedMe = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlockedMe");
          final int _cursorIndexOfIsAdminBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isAdminBlocked");
          final List<ContusContact> _result = new ArrayList<ContusContact>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ContusContact _item;
            final String _tmpJid;
            if (_cursor.isNull(_cursorIndexOfJid)) {
              _tmpJid = null;
            } else {
              _tmpJid = _cursor.getString(_cursorIndexOfJid);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpMobileNumber;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobileNumber = null;
            } else {
              _tmpMobileNumber = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final Boolean _tmpIsMuted;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfIsMuted)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfIsMuted);
            }
            _tmpIsMuted = _tmp == null ? null : _tmp != 0;
            final Boolean _tmpIsBlocked;
            final Integer _tmp_1;
            if (_cursor.isNull(_cursorIndexOfIsBlocked)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(_cursorIndexOfIsBlocked);
            }
            _tmpIsBlocked = _tmp_1 == null ? null : _tmp_1 != 0;
            final Boolean _tmpIsBlockedMe;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfIsBlockedMe)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfIsBlockedMe);
            }
            _tmpIsBlockedMe = _tmp_2 == null ? null : _tmp_2 != 0;
            final Boolean _tmpIsAdminBlocked;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfIsAdminBlocked)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfIsAdminBlocked);
            }
            _tmpIsAdminBlocked = _tmp_3 == null ? null : _tmp_3 != 0;
            _item = new ContusContact(_tmpJid,_tmpName,_tmpImage,_tmpMobileNumber,_tmpStatus,_tmpEmail,_tmpIsMuted,_tmpIsBlocked,_tmpIsBlockedMe,_tmpIsAdminBlocked);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public List<ContusContact> getBlockedContusContactS() {
    final String _sql = "SELECT * FROM ContusContact WHERE isBlocked";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfJid = CursorUtil.getColumnIndexOrThrow(_cursor, "jid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobileNumber");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfIsMuted = CursorUtil.getColumnIndexOrThrow(_cursor, "isMuted");
      final int _cursorIndexOfIsBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlocked");
      final int _cursorIndexOfIsBlockedMe = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlockedMe");
      final int _cursorIndexOfIsAdminBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isAdminBlocked");
      final List<ContusContact> _result = new ArrayList<ContusContact>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ContusContact _item;
        final String _tmpJid;
        if (_cursor.isNull(_cursorIndexOfJid)) {
          _tmpJid = null;
        } else {
          _tmpJid = _cursor.getString(_cursorIndexOfJid);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final String _tmpMobileNumber;
        if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
          _tmpMobileNumber = null;
        } else {
          _tmpMobileNumber = _cursor.getString(_cursorIndexOfMobileNumber);
        }
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final Boolean _tmpIsMuted;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsMuted)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsMuted);
        }
        _tmpIsMuted = _tmp == null ? null : _tmp != 0;
        final Boolean _tmpIsBlocked;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsBlocked)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsBlocked);
        }
        _tmpIsBlocked = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpIsBlockedMe;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsBlockedMe)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsBlockedMe);
        }
        _tmpIsBlockedMe = _tmp_2 == null ? null : _tmp_2 != 0;
        final Boolean _tmpIsAdminBlocked;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfIsAdminBlocked)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfIsAdminBlocked);
        }
        _tmpIsAdminBlocked = _tmp_3 == null ? null : _tmp_3 != 0;
        _item = new ContusContact(_tmpJid,_tmpName,_tmpImage,_tmpMobileNumber,_tmpStatus,_tmpEmail,_tmpIsMuted,_tmpIsBlocked,_tmpIsBlockedMe,_tmpIsAdminBlocked);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ContusContact> getBlockedMeContusContactS() {
    final String _sql = "SELECT * FROM ContusContact WHERE isBlockedMe";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfJid = CursorUtil.getColumnIndexOrThrow(_cursor, "jid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobileNumber");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfIsMuted = CursorUtil.getColumnIndexOrThrow(_cursor, "isMuted");
      final int _cursorIndexOfIsBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlocked");
      final int _cursorIndexOfIsBlockedMe = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlockedMe");
      final int _cursorIndexOfIsAdminBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isAdminBlocked");
      final List<ContusContact> _result = new ArrayList<ContusContact>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ContusContact _item;
        final String _tmpJid;
        if (_cursor.isNull(_cursorIndexOfJid)) {
          _tmpJid = null;
        } else {
          _tmpJid = _cursor.getString(_cursorIndexOfJid);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final String _tmpMobileNumber;
        if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
          _tmpMobileNumber = null;
        } else {
          _tmpMobileNumber = _cursor.getString(_cursorIndexOfMobileNumber);
        }
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final Boolean _tmpIsMuted;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsMuted)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsMuted);
        }
        _tmpIsMuted = _tmp == null ? null : _tmp != 0;
        final Boolean _tmpIsBlocked;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsBlocked)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsBlocked);
        }
        _tmpIsBlocked = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpIsBlockedMe;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsBlockedMe)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsBlockedMe);
        }
        _tmpIsBlockedMe = _tmp_2 == null ? null : _tmp_2 != 0;
        final Boolean _tmpIsAdminBlocked;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfIsAdminBlocked)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfIsAdminBlocked);
        }
        _tmpIsAdminBlocked = _tmp_3 == null ? null : _tmp_3 != 0;
        _item = new ContusContact(_tmpJid,_tmpName,_tmpImage,_tmpMobileNumber,_tmpStatus,_tmpEmail,_tmpIsMuted,_tmpIsBlocked,_tmpIsBlockedMe,_tmpIsAdminBlocked);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ContusContact> getAdminBlockedContusContactS() {
    final String _sql = "SELECT * FROM ContusContact WHERE isAdminBlocked";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfJid = CursorUtil.getColumnIndexOrThrow(_cursor, "jid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobileNumber");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfIsMuted = CursorUtil.getColumnIndexOrThrow(_cursor, "isMuted");
      final int _cursorIndexOfIsBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlocked");
      final int _cursorIndexOfIsBlockedMe = CursorUtil.getColumnIndexOrThrow(_cursor, "isBlockedMe");
      final int _cursorIndexOfIsAdminBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "isAdminBlocked");
      final List<ContusContact> _result = new ArrayList<ContusContact>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ContusContact _item;
        final String _tmpJid;
        if (_cursor.isNull(_cursorIndexOfJid)) {
          _tmpJid = null;
        } else {
          _tmpJid = _cursor.getString(_cursorIndexOfJid);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final String _tmpMobileNumber;
        if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
          _tmpMobileNumber = null;
        } else {
          _tmpMobileNumber = _cursor.getString(_cursorIndexOfMobileNumber);
        }
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final Boolean _tmpIsMuted;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsMuted)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsMuted);
        }
        _tmpIsMuted = _tmp == null ? null : _tmp != 0;
        final Boolean _tmpIsBlocked;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsBlocked)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsBlocked);
        }
        _tmpIsBlocked = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpIsBlockedMe;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsBlockedMe)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsBlockedMe);
        }
        _tmpIsBlockedMe = _tmp_2 == null ? null : _tmp_2 != 0;
        final Boolean _tmpIsAdminBlocked;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfIsAdminBlocked)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfIsAdminBlocked);
        }
        _tmpIsAdminBlocked = _tmp_3 == null ? null : _tmp_3 != 0;
        _item = new ContusContact(_tmpJid,_tmpName,_tmpImage,_tmpMobileNumber,_tmpStatus,_tmpEmail,_tmpIsMuted,_tmpIsBlocked,_tmpIsBlockedMe,_tmpIsAdminBlocked);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isContusContact(final String jid) {
    final String _sql = "SELECT count(*) FROM ContusContact WHERE jid LIKE (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (jid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, jid);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object deleteContusContacts(final List<String> jidList,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        StringBuilder _stringBuilder = StringUtil.newStringBuilder();
        _stringBuilder.append("delete from ContusContact where jid in (");
        final int _inputSize = jidList.size();
        StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
        _stringBuilder.append(")");
        final String _sql = _stringBuilder.toString();
        final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
        int _argIndex = 1;
        for (String _item : jidList) {
          if (_item == null) {
            _stmt.bindNull(_argIndex);
          } else {
            _stmt.bindString(_argIndex, _item);
          }
          _argIndex ++;
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
