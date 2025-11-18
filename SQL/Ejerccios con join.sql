-- join
select tEditorial.cnombre, tlibro.ctitulo 
from teditorial, tlibro
where teditorial.neditorialid = tlibro.neditorialid;

select teditorial.cnombre, tlibro.ctitulo
from teditorial inner join tlibro 
on teditorial.nEditorialID = tlibro.nEditorialID;

select teditorial.cnombre, tlibro.ctitulo
from teditorial inner join tlibro
using (neditorialid);

-- libro pag 108
select csignatura, ctitulo
from tejemplar inner join tlibro
using(nlibroid);

select csignatura, ctitulo, cnombre
from tejemplar inner join tlibro inner join teditorial
on tlibro.nlibroid = tejemplar.nlibroid and tlibro.neditorialid = teditorial.nEditorialID;