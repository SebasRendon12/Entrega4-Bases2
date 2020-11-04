load data
infile 'C:\Users\ricardo\Desktop\Trabajo4\MuestraTransacciones.csv'
append
    into table TRANSACCION
FIELDS TERMINATED BY ";" TRAILING NULLCOLS
( block_id,
  indice,
  hash,
  time,
  failed,
  type,
  sender,
  recipient,
  call_count,
  value,
  value_usd,
  internal_value,
  internal_value_usd,
  fee,
  fee_usd,
  gas_used,
  gas_limit,
  gas_price,
  input_hex,
  nonce,
  v,
  r,
  s,
  x,
  y)