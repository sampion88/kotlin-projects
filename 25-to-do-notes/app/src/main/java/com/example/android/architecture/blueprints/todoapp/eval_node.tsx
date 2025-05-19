import { useRouter } from 'next/router';

// ruleid: AIK_ts_eval_nodejs
const router = useRouter();

// ruleid: AIK_ts_eval_nodejs
eval(router.query.test);


function some(req) {
  // ruleid: AIK_ts_eval_nodejs
  eval(router.query.test);
}
