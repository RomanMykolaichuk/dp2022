export interface User {
    name:string;
    age:number;
    _links:{
        
            self: {
            href: string;
            },
            user: {
            href: string;
            }
            }
    }

