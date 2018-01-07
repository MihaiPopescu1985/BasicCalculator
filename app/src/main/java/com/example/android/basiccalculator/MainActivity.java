package com.example.android.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int FirstNumber = 0;
    private int SecondNumber = 0;

    private boolean IsPlus = false;
    private boolean IsMinus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(int number) {
        String message = Integer.toString(number);

        TextView priceTextView;
        priceTextView = (TextView) findViewById(R.id.result);
        priceTextView.setText(message);
    }

    public void AddOne(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                FirstNumber = 1;
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                FirstNumber += 1;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                SecondNumber = 1;
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                SecondNumber += 1;
                display(SecondNumber);
                return;
            }
        }
    }

    public void AddTwo(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                FirstNumber = 2;
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                FirstNumber += 2;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                SecondNumber = 2;
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                SecondNumber += 2;
                display(SecondNumber);
                return;
            }
        }
    }

    public void AddThree(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                FirstNumber = 3;
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                FirstNumber += 3;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                SecondNumber = 3;
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                SecondNumber += 3;
                display(SecondNumber);
                return;
            }
        }
    }

    public void AddFour(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                FirstNumber = 4;
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                FirstNumber += 4;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                SecondNumber = 4;
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                SecondNumber += 4;
                display(SecondNumber);
                return;
            }
        }
    }

    public void AddFive(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                FirstNumber = 5;
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                FirstNumber += 5;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                SecondNumber = 5;
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                SecondNumber += 5;
                display(SecondNumber);
                return;
            }
        }
    }

    public void AddSix(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                FirstNumber = 6;
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                FirstNumber += 6;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                SecondNumber = 6;
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                SecondNumber += 6;
                display(SecondNumber);
                return;
            }
        }
    }

    public void AddSeven(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                FirstNumber = 7;
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                FirstNumber += 7;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                SecondNumber = 7;
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                SecondNumber += 7;
                display(SecondNumber);
                return;
            }
        }
    }

    public void AddEight(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                FirstNumber = 8;
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                FirstNumber += 8;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                SecondNumber = 8;
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                SecondNumber += 8;
                display(SecondNumber);
                return;
            }
        }
    }

    public void AddNine(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                FirstNumber = 9;
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                FirstNumber += 9;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                SecondNumber = 9;
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                SecondNumber += 9;
                display(SecondNumber);
                return;
            }
        }
    }

    public void AddZero(View view)
    {
        if (!IsPlus && !IsMinus)
        {
            if (FirstNumber == 0)
            {
                display(FirstNumber);
                return;
            }
            else
            {
                FirstNumber *= 10;
                display(FirstNumber);
                return;
            }
        }
        if (IsPlus || IsMinus)
        {
            if (SecondNumber == 0)
            {
                display(SecondNumber);
                return;
            }
            else
            {
                SecondNumber *= 10;
                display(SecondNumber);
                return;
            }
        }
    }

    public void Plus(View view)
    {
        if(!IsPlus && !IsMinus)
        {
            IsPlus = true;
            display(SecondNumber);
            return;
        }
    }

    public void Minus(View view)
    {
        if(!IsPlus && !IsMinus)
        {
            IsMinus = true;
            display(SecondNumber);
            return;
        }
    }

    public void Calculate(View view)
    {
        if(IsPlus)
        {
            display(FirstNumber+SecondNumber);
        }
        if(IsMinus)
        {
            display(FirstNumber-SecondNumber);
        }
        FirstNumber = 0;
        SecondNumber = 0;
        IsPlus = false;
        IsMinus = false;

        return;
    }

    public void Reset(View view)
    {
        FirstNumber = 0;
        SecondNumber = 0;
        IsPlus = false;
        IsMinus = false;
        display(FirstNumber);

        return;
    }
}
