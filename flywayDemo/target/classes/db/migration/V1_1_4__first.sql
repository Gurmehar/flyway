DROP FUNCTION IF EXISTS getVal();
Create or replace  function getVal()RETURNS  integer
LANGUAGE plpgsql
AS 
$$

declare  a   int;
begin

EXECUTE '(select count(*)  from address)' into a;
return  a;
END;	
$$;