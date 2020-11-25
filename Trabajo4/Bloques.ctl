load data
infile 'C:\Users\RENDONARTEAGA\Documents\U. Nacional\Bases de Datos 2\projects\Entrega4-Bases2\Trabajo4\MuestraBloques.csv'
append
    into table BLOQUE
FIELDS TERMINATED BY ";" TRAILING NULLCOLS
(id,hash,time,tamanio,miner,extra_data_hex,dificult,gas_used,gas_limit,logs_bloom,mix_hash,nonce,receipts_root,sha3_uncles,state_root,total_difficulty,transactions_root,
uncle_count,transaction_count,synthetic_transaction_count,call_count,synthentic_call_count,value_total,value_total_usd,internal_value_total,internal_value_total_usd,
generation,generation_usd,uncle_generation,uncle_generation_usd,fee_total,fee_total_usd,reward,reward_usd)


