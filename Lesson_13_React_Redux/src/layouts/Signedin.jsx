import React from 'react'
import { Menu,Dropdown,Image } from 'semantic-ui-react'

export default function Signedin({signOut}) {
    return (
        <div>
        <Menu.Item>
            <Image avatar spaced="right" src="https://avatars.githubusercontent.com/u/70813725?v=4"/>
            <Dropdown pointing="top left" text="Taleh">
                <Dropdown.Menu>
                    <Dropdown.Item text="Info" icon="info"/>
                    <Dropdown.Item onClick={signOut} text="Logout" icon="sign-out"/>
                </Dropdown.Menu>
            </Dropdown>
        </Menu.Item> 
        </div>
    )
}
