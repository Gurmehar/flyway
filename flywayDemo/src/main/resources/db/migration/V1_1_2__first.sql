alter table public.address  RENAME COLUMN  state TO address_state;
INSERT INTO public.uniphore_schema_version(installed_rank,version, description, type,script,  installed_by, installed_on,execution_time, success,checksum)
	VALUES ( 4,'1.1.3', 'first', 'SQL', 'V1_1_3__first.sql','postgres', CURRENT_TIMESTAMP, 4, 'true',426805989);