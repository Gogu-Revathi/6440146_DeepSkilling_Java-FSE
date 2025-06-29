CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
  p_LoanAmount IN NUMBER,
  p_AnnualRate IN NUMBER,
  p_DurationYears IN NUMBER
)
RETURN NUMBER IS
  v_MonthlyRate NUMBER := p_AnnualRate / (12 * 100);
  v_Months NUMBER := p_DurationYears * 12;
  v_Installment NUMBER;
BEGIN
  IF v_MonthlyRate = 0 THEN
    v_Installment := p_LoanAmount / v_Months;
  ELSE
    v_Installment := p_LoanAmount * v_MonthlyRate * POWER(1 + v_MonthlyRate, v_Months) /
                     (POWER(1 + v_MonthlyRate, v_Months) - 1);
  END IF;
  RETURN ROUND(v_Installment, 2);
END;
/
