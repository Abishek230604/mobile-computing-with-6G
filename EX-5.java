ACTIVITY_MAIN.XML

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
 xmlns:tools="http://schemas.android.com/tools"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:paddingBottom="@dimen/activity_vertical_margin"
 android:paddingLeft="@dimen/activity_horizontal_margin"
 android:paddingRight="@dimen/activity_horizontal_margin"
 android:paddingTop="@dimen/activity_vertical_margin"
 tools:context=".MainActivity" >
 <Button
 android:id="@+id/button2"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/button3"
 android:layout_below="@+id/button1"
 android:text="Insert" />
 <Button
 android:id="@+id/button1"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/button3"
 android:layout_alignParentTop="true"
 android:layout_marginTop="50dp"
 android:text="Create" />
 <Button
 android:id="@+id/button3"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/button5"
 android:layout_below="@+id/button2"
 android:text="Update" />
 <Button
 android:id="@+id/button4"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/button3"
 android:layout_below="@+id/button3"
 android:text="Delete" />
 <Button
 android:id="@+id/button5"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_below="@+id/button4"
 android:layout_centerHorizontal="true"
 android:text="Retrive" />
</RelativeLayout>

ACTIVITY_DELETE.XML

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
 xmlns:tools="http://schemas.android.com/tools"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:paddingBottom="@dimen/activity_vertical_margin"
 android:paddingLeft="@dimen/activity_horizontal_margin"
 android:paddingRight="@dimen/activity_horizontal_margin"
 android:paddingTop="@dimen/activity_vertical_margin"
 tools:context=".Delete" >
 <EditText
 android:id="@+id/editText1"
 android:layout_width="match_parent"
 android:hint="Delete By ID"
 android:layout_height="wrap_content"
 android:layout_alignParentLeft="true"
 android:layout_alignParentTop="true"
 android:layout_marginTop="24dp"
 android:ems="10" >
 <requestFocus />
 </EditText>
 <Button
 android:id="@+id/button1"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignParentBottom="true"
 android:layout_centerHorizontal="true"
 android:layout_marginBottom="50dp"
 android:text="Delete" />
</RelativeLayout>

ACTIVITY_INSERT.XML

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
 xmlns:tools="http://schemas.android.com/tools"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:paddingBottom="@dimen/activity_vertical_margin"
 android:paddingLeft="@dimen/activity_horizontal_margin"
 android:paddingRight="@dimen/activity_horizontal_margin"
 android:paddingTop="@dimen/activity_vertical_margin"
 tools:context=".Insert" >
 <Button
 android:id="@+id/button1"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignParentBottom="true"
 android:layout_centerHorizontal="true"
 android:layout_marginBottom="30dp"
aravindonlineclasses.com
 android:text="Insert" />
 <EditText
 android:id="@+id/editText2"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/editText3"
 android:layout_below="@+id/editText1"
 android:layout_marginTop="15dp"
 android:ems="10"
 android:hint="Name" />
 <EditText
 android:id="@+id/editText1"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/editText2"
 android:layout_alignParentTop="true"
 android:layout_marginTop="29dp"
 android:ems="10"
 android:hint="Id" >
 <requestFocus />
 </EditText>
 <EditText
 android:id="@+id/editText3"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/button1"
 android:layout_below="@+id/editText2"
 android:layout_marginTop="19dp"
 android:ems="10"
 android:hint="Number"
 android:inputType="phone" />
</RelativeLayout>

ACTIVITY_RETRIVE.XML

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
 xmlns:tools="http://schemas.android.com/tools"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:paddingBottom="@dimen/activity_vertical_margin"
 android:paddingLeft="@dimen/activity_horizontal_margin"
 android:paddingRight="@dimen/activity_horizontal_margin"
 android:paddingTop="@dimen/activity_vertical_margin"
 tools:context=".Retrive" >
 <EditText
 android:id="@+id/editText1"
 android:layout_width="match_parent"
 android:hint="Retrive By ID"
 android:layout_height="wrap_content"
aravindonlineclasses.com
 android:layout_alignParentLeft="true"
 android:layout_alignParentTop="true"
 android:layout_marginTop="15dp"
 android:ems="10" >
 <requestFocus />
 </EditText>
 <Button
 android:id="@+id/button1"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_alignParentBottom="true"
 android:layout_centerHorizontal="true"
 android:layout_marginBottom="32dp"
 android:text="Retrive" />
</RelativeLayout>

ACTIVITY_UPDATE.XML

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
 xmlns:tools="http://schemas.android.com/tools"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:paddingBottom="@dimen/activity_vertical_margin"
 android:paddingLeft="@dimen/activity_horizontal_margin"
 android:paddingRight="@dimen/activity_horizontal_margin"
 android:paddingTop="@dimen/activity_vertical_margin"
 tools:context=".Update" >
 <EditText
 android:id="@+id/editText1"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_alignParentLeft="true"
 android:layout_alignParentTop="true"
 android:layout_marginLeft="22dp"
 android:layout_marginTop="47dp"
 android:ems="10"
 android:hint="Update By ID" >
 <requestFocus />
 </EditText>
 <EditText
 android:id="@+id/editText2"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/editText1"
 android:layout_below="@+id/editText1"
 android:layout_marginTop="33dp"
 android:ems="10"
 android:hint="Set Name" />
 <EditText
 android:id="@+id/editText3"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/editText2"
 android:layout_below="@+id/editText2"
 android:layout_marginTop="16dp"
 android:ems="10"
 android:hint="Set Number" />
 <Button
 android:id="@+id/button1"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_alignLeft="@+id/editText3"
 android:layout_alignParentBottom="true"
 android:layout_alignRight="@+id/editText3"
 android:layout_marginBottom="70dp"
 android:text="Update" />
</RelativeLayout>

MAIN_ACTIVITY.JAVA

package com.example.ex.no5;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends Activity 
{
//Defining the Views
Button create, insert, update, delete, retrive;
//Defining the Database
SQLiteDatabase db;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
aravindonlineclasses.com
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
//Referring the Views
create = (Button) findViewById(R.id.button1);
insert = (Button) findViewById(R.id.button2);
update = (Button) findViewById(R.id.button3);
delete = (Button) findViewById(R.id.button4);
retrive = (Button) findViewById(R.id.button5);
//Creating Database
create.setOnClickListener(new OnClickListener() 
{
@Override
public void onClick(View v) 
{
// TODO Auto-generated method stub
//Statement for Creating Database
db = openOrCreateDatabase("myDataBase.db", 
MODE_PRIVATE, null);
//Query for Creating Table 
db.execSQL("create table if not exists sample(id 
varchar,name varchar,number varchar);"); 
Toast.makeText(getApplicationContext(), "Created", 
5000).show();
db.close();
}
});
//Navigating to insert class for inserting Data into Database
insert.setOnClickListener(new OnClickListener()
{
@Override
public void onClick(View v) 
{
// TODO Auto-generated method stub
Intent Inset = new Intent(MainActivity.this, 
Insert.class);
startActivity(Inset);
}
});
//Navigating to update class for updating Data into Database
update.setOnClickListener(new OnClickListener()
{
@Override
public void onClick(View v)
{
// TODO Auto-generated method stub
Intent Update = new Intent(MainActivity.this, 
Update.class);
startActivity(Update);
}
});
//Navigating to delete class for deleting Data from Database
delete.setOnClickListener(new OnClickListener() 
{
@Override
public void onClick(View v) 
{
// TODO Auto-generated method stub
Intent Delete = new Intent(MainActivity.this, 
Delete.class);
startActivity(Delete);
}
});
//Navigating to retrieve class for retrieving Data from Database
retrive.setOnClickListener(new OnClickListener() 
{
@Override
public void onClick(View v) 
{
// TODO Auto-generated method stub
Intent Retrive = new Intent(MainActivity.this, 
Retrive.class);
startActivity(Retrive);
}
});
}
}

DELETE.JAVA

package com.example.ex.no5;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Delete extends Activity
{
EditText Id;
Button del;
SQLiteDatabase db;
@Override

protected void onCreate(Bundle savedInstanceState) 
{
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_delete);
Id = (EditText)findViewById(R.id.editText1);
del = (Button)findViewById(R.id.button1);
del.setOnClickListener(new OnClickListener()
{
@Override
public void onClick(View arg0)
{
// TODO Auto-generated method stub
//Getting the Values from EditText
String s1 = Id.getText().toString();
//Delete Operation
db = openOrCreateDatabase("myDataBase.db", 
MODE_PRIVATE, null);
//Query for Deleting Table
db.execSQL("delete from sample where id='"+s1+"';");
Toast.makeText(getApplicationContext(), "ID :"+s1+" 
"+"Deleted", 5000).show(); 
db.close();
}
});
}
}

INSERT.JAVA

package com.example.ex.no5;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Insert extends Activity 
{
EditText id,name,number;
Button insert;
SQLiteDatabase db;
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_insert);
id = (EditText)findViewById(R.id.editText1);
name = (EditText)findViewById(R.id.editText2);
number = (EditText)findViewById(R.id.editText3);
insert = (Button)findViewById(R.id.button1);
insert.setOnClickListener(new OnClickListener() 
{
@Override
public void onClick(View v)
{
// TODO Auto-generated method stub
//Getting the Values from EditText
String s1 = id.getText().toString();
String s2 = name.getText().toString();
String s3 = number.getText().toString();
//Insert Operation
db = openOrCreateDatabase("myDataBase.db", 
MODE_PRIVATE, null);
//Query for Inserting Table 
db.execSQL("insert into sample 
values('"+s1+"','"+s2+"','"+s3+"');"); 
Toast.makeText(getApplicationContext(), "Inserted", 
5000).show();
db.close();
}
});
}
}

RETRIVE.JAVA

package com.example.ex.no5;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Retrive extends Activity 
{
EditText Id;
Button ret;
SQLiteDatabase db;
aravindonlineclasses.com
Cursor c;
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_retrive);
Id = (EditText)findViewById(R.id.editText1);
ret = (Button)findViewById(R.id.button1);
ret.setOnClickListener(new OnClickListener() 
{
@Override
public void onClick(View arg0) 
{
// TODO Auto-generated method stub
//Getting the Values from EditText
String s1 = Id.getText().toString();
//Retrive operation
db = openOrCreateDatabase("myDataBase.db", 
MODE_PRIVATE, null);
//Query for Retriving Table
c = db.rawQuery("select * from sample where 
id='"+s1+"'", null);
if(c.getCount()==0)
{
Toast.makeText(getApplicationContext(), "ID 
:"+s1+" "+"NotFound", 5000).show();
}
while (c.moveToNext()) 
{
String id = c.getString(0);
String name = c.getString(1);
String num = c.getString(2);
Toast.makeText(getApplicationContext(), id+" 
"+name+" "+num, Toast.LENGTH_SHORT).show(); 
}
c.close();
db.close();
}
});
}
}

UPDATE.JAVA

package com.example.ex.no5;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Update extends Activity {
EditText id1,name1,number1;
Button update1;
SQLiteDatabase db;
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_update);
id1 = (EditText)findViewById(R.id.editText1);
name1 = (EditText)findViewById(R.id.editText2);
number1 = (EditText)findViewById(R.id.editText3);
update1 = (Button)findViewById(R.id.button1);
update1.setOnClickListener(new OnClickListener() 
{
@Override
public void onClick(View v) 
{
// TODO Auto-generated method stub
//Getting the Values from EditText
String s1 = id1.getText().toString();
String s2 = name1.getText().toString();
String s3 = number1.getText().toString();
//Update Operation
db = openOrCreateDatabase("myDataBase.db", 
MODE_PRIVATE, null);
//Query for Inserting Table 
db.execSQL("update sample set 
name='"+s2+"',number='"+s3+"' where id='"+s1+"';"); 
Toast.makeText(getApplicationContext(), "ID :"+s1+" 
"+"Update", 5000).show();
db.close();
}
});
}




