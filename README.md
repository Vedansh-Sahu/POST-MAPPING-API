➕ POST API Endpoints
These endpoints handle the creation of new data resources in the system.

Create Journal Entry
Creates a new journal entry, automatically appends the current system timestamp, and persists it to the database.

URL: /journal

Method: POST

Auth Required: No

Request Body
The request payload should be a JSON object representing the journal entry attributes (excluding the date, which is handled automatically by the server).
